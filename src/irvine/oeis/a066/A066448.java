package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066448 Triangle T(n,k) giving number of basis partitions of n with a Durfee square of order k (n &gt;= 0, 0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A066448 extends A066447 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
