package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A389255 Triangle read by rows: T(n,k) = number of heapable permutations of length n with exactly k decreasing runs.
 * @author Sean A. Irvine
 */
public class A389255 extends AbstractSequence {

  // Cf. A388139

  private int mN;
  private int[] mP;
  private long[] mRow = new long[0];
  private int mM = 0;

  protected A389255(final int offset) {
    super(offset);
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A389255() {
    this(1);
  }

  // Cf. https://oeis.org/A336282
  // Shifted by 1, so that the -1 of the python is 0 here
  private boolean isHeapable(final int[] p, final int m) {
    final int[] sig = new int[mN + 1];
    sig[1] = 2;
    for (int k = 1; k < m; ++k) {
      int j = p[k] + 1;
      sig[j] = 2;
      while (j > 0) {
        --j;
        if (sig[j] > 0) {
          --sig[j];
          break;
        }
      }
      if (j <= 0) {
        return false;
      }
    }
    return true;
  }

  // Incrementally build the permutation checking heapable property as we go
  // This is still rebuilding the heap for each element added to the partial
  // pemutation, but in principle we could unwind the addition at each stage.
  private void search(final int pos, final long used) {
    if (pos == mP.length) {
      ++mRow[contribution(mP) - 1];
      return;
    }
    for (int k = 0; k < mN; ++k) {
      if ((used & (1L << k)) == 0) {
        mP[pos] = k;
        if (isHeapable(mP, pos + 1)) {
          search(pos + 1, used | (1L << k));
        }
      }
    }
  }

  protected int contribution(final int[] p) {
    return Permutation.countDecreasingRuns(p);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mP = new int[++mN];
      mRow = new long[mN];
      search(0, 0);
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
