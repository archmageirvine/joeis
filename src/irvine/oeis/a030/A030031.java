package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030031 Binomial((n+1)^2, prime(n)).
 * @author Sean A. Irvine
 */
public class A030031 extends A000040 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Binomial.binomial(mN.square(), super.next());
  }
}
