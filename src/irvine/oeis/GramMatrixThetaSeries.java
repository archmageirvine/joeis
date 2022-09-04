package irvine.oeis;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * Theta series specified by a Gram matrix.  This works by direct enumeration,
 * in many cases much better formulas are available.  This also assumes
 * parameters are small enough to work in longs.
 * @author Sean A. Irvine
 */
public class GramMatrixThetaSeries implements SequenceWithOffset {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final long[][] mMatrix;
  private final long[] mVec;
  private final long mStep;
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1; // Sequence value to compute
  private long mM = -1; // Size of hypercube searched so far
  private long mLastMin = 0; // Shortest vector in search of bound mM
  private int mOffset; // first index

  /**
   * Construct a new theta series for the specified Gram matrix
   * @param offset
   * @param matrix Gram matrix
   * @param step step size
   */
  protected GramMatrixThetaSeries(final int offset, final long[][] matrix, final long step) {
    mOffset = offset;
    mMatrix = matrix;
    mVec = new long[matrix.length];
    mStep = step;
  }

  /**
   * Construct a new theta series for the specified Gram matrix
   * @param matrix Gram matrix
   * @param step step size
   */
  protected GramMatrixThetaSeries(final long[][] matrix, final long step) {
    this(0, matrix, step);
  }

  /**
   * Construct a new theta series for the specified Gram matrix
   * @param matrix Gram matrix
   */
  protected GramMatrixThetaSeries(final long[][] matrix) {
    this(0, matrix, 1);
  }

  /**
   * Get the offset.
   * @return first index
   */
  @Override
  public int getOffset() {
    return mOffset;
  }

  private boolean bump() {
    // Step to the next possible vector, but we only want to consider vectors
    // not already processed.  This means one of the coordinates must be +/- mM
    outer:
    while (true) {
      for (int k = mVec.length - 1; k >= 0; --k) {
        if (++mVec[k] <= mM) {
          if (k != mVec.length - 1) {
            return true; // values > k must be -mM
          }
          for (int j = k; j >= 0; --j) {
            if (mVec[j] == mM || mVec[j] == -mM) {
              return true;
            }
          }
          continue outer;
        }
        mVec[k] = -mM;
      }
      // All possibilities exhausted
      return false;
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mN * mStep >= mLastMin) {
      ++mM;
      Arrays.fill(mVec, -mM); // We will search hypercube [-mM,mM]^dim
      // Use symmetry for 0th coordinate; i.e., search only [0,mM] for 0-th coordinate
      // In the special case of 1-dimension the only value to try is mM
      mVec[0] = mVec.length == 1 ? mM : 0;
      long min = Long.MAX_VALUE;
      do {
        // Compute vec * matrix * vec^T which is a single integer
        long s = 0;
        for (int k = 0; k < mVec.length; ++k) {
          long t = 0;
          for (int j = 0; j < mVec.length; ++j) {
            t += mVec[j] * mMatrix[j][k];
          }
          s += t * mVec[k];
        }
        if (s < min) {
          min = s;
        }
        mCounts.set(s, mCounts.get(s) + (mVec[0] == 0 ? 1 : 2));
      } while (bump());
      if (mVerbose) {
        StringUtils.message("Hypercube bound m = " + mM + " min = " + min);
      }
      if (min < mLastMin) {
        throw new RuntimeException("Increased hypercube had smaller min then previous value");
      }
      mLastMin = min;
    }
    return Z.valueOf(mCounts.get(mStep * mN));
  }

  /**
   * Run on the specified matrix
   * @param args the matrix (space separated numbers, assumed to be a square matrix)
   */
  public static void main(final String[] args) {
    final int s = IntegerUtils.sqrt(args.length);
    if (s * s != args.length) {
      throw new IllegalArgumentException("Not a square matrix");
    }
    final long[][] m = new long[s][s];
    for (int r = 0, k = 0; r < s; ++r) {
      for (int c = 0; c < s; ++c, ++k) {
        m[r][c] = Integer.parseInt(args[k]);
      }
    }
    final GramMatrixThetaSeries seq = new GramMatrixThetaSeries(m);
    while (true) {
      System.out.println(seq.next());
    }
  }
}
