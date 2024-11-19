package irvine.oeis.a073;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001764;

/**
 * A073147 Triangle of numbers {a(n,k), n &gt;= 0, 0&lt;=k&lt;=n} defined by a(0,0)=1, a(n,0)=A001764(n), a(n,n)=A006013(n), a(n,n-1)=A006629(n-1).
 * @author Sean A. Irvine
 */
public class A073147 extends Sequence0 {

  private final DirectSequence mA = new A001764();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mM, k -> mA.a(mN - k).multiply(mA.a(k)));
  }
}
