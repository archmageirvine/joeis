package irvine.oeis;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * Representatives specified by a Gram matrix.  This works by direct enumeration,
 * in many cases much better formulas are available.  This also assumes
 * parameters are small enough to work in longs.
 * @author Sean A. Irvine
 */
public class GramMatrixRepresentatives extends AbstractSequence {

  private static final int DEFOFF = 1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final long[][] mMatrix;
  private final long[] mVec;
  private final long mStep;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = -1; // Sequence value to compute
  private long mM = -1; // Size of hypercube searched so far
  private long mLastMin = 0; // Shortest vector in search of bound mM

  /**
   * Construct a new theta series for the specified Gram matrix
   * @param matrix Gram matrix
   * @param step step size
   */
  protected GramMatrixRepresentatives(final long[][] matrix, final long step) {
    super(DEFOFF);
    mMatrix = matrix;
    mVec = new long[matrix.length];
    mStep = step;
  }

  /**
   * Construct a new theta series for the specified Gram matrix
   * @param matrix Gram matrix
   */
  protected GramMatrixRepresentatives(final long[][] matrix) {
    this(matrix, 1);
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
    while (true) {
      ++mN;
      while (mN >= mLastMin) {
        ++mM;
        Arrays.fill(mVec, -mM); // We will search hypercube [-mM,mM]^dim
        mVec[0] = 0; // Use symmetry for 0th coordinate; i.e., search only [0,mM] for 0-th coordinate
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
          mSeen.set(s);
        } while (bump());
        if (mVerbose) {
          StringUtils.message("Hypercube bound m = " + mM + " min = " + min);
        }
        if (min < mLastMin) {
          throw new RuntimeException("Increased hypercube had smaller min then previous value");
        }
        mLastMin = min;
      }
      if (mSeen.isSet(mN)) {
        return Z.valueOf(mN / mStep);
      }
    }
  }
}
