package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a080.A080046;

/**
 * A082611 a(n) = Sum_{k=1..n} T(n,k) / (k * (n-k+1)) where T is given in A080046.
 * @author Sean A. Irvine
 */
public class A082611 extends A080046 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> mT.get(mN, k).divide(k).divide(mN - k + 1));
  }
}
