package irvine.oeis.a300;

import irvine.math.z.Z;
import irvine.oeis.a007.A007975;

/**
 * A300003 Triangle read by rows: <code>T(n, k) =</code> number of permutations that are k "block reversals" away from <code>12...n</code>, for <code>n &gt;= 0</code>, and (for <code>n&gt;0) 0 &lt;= k &lt;= n-1</code>.
 * @author Sean A. Irvine
 */
public class A300003 extends A007975 {

  private int mM = 0;

  @Override
  protected int start() {
    return -1;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      // Start the next row
      init();
      mM = 0;
    } else {
      step();
    }
    return Z.valueOf(mPrev.size());
  }
}
