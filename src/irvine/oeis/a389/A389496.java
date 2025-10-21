package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A389496 Triangle T(n,k) read by rows: T(n,k) is the number of heapable permutations of length n whose major index is k.
 * @author Sean A. Irvine
 */
public class A389496 extends A336282 {

  protected long[] mRow = new long[0];
  private int mM = 0;

  /** Construct the sequence. */
  public A389496() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    synchronized (A389496.this) {
      ++mRow[Permutation.majorIndex(p)];
    }
    return 0;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new long[mN * (mN + 1) / 2 + 1];
      super.next(); // trigger the parallel search
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
