package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a080.A080046;

/**
 * A082611 a(n) = Sum_{i=1..k} T(i,k)/(i*(k-i+1)), (k&gt;=1, 1&lt;=n&lt;=k), where T(,) is given in A080046.
 * @author Sean A. Irvine
 */
public class A082611 extends A080046 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> mT.get(mN, k).divide(k).divide(mN - k + 1));
  }
}
