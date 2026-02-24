package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078448 Triangle T(n,k) for 1 &lt;= n, 1 &lt;= k &lt;= n read by rows: T(1,1) = 1; for n &gt; 1: T(n,1) = T(n-1,n-1) + 1; for n &gt; 1 and k &lt;=n: T(n,k) = smallest number &gt; T(n,k-1) which is relatively prime to T(n,j) for 1 &lt;= j &lt; k.
 * @author Sean A. Irvine
 */
public class A078448 extends Sequence1 {

  protected Z[] mRow = {};
  private int mM = 0;

  private boolean is(final Z v, final int pos) {
    for (int k = 0; k < pos; ++k) {
      if (!v.gcd(mRow[k]).isOne()) {
        return false;
      }
    }
    return true;
  }

  protected void step() {
    if (mRow.length == 0) {
      mRow = new Z[] {Z.ONE};
    } else {
      Z t = mRow[mRow.length - 1].add(1);
      mRow = new Z[mRow.length + 1];
      mRow[0] = t;
      for (int k = 1; k < mRow.length; ++k) {
        do {
          t = t.add(1);
        } while (!is(t, k));
        mRow[k] = t;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      step();
      mM = 0;
    }
    return mRow[mM];
  }
}


