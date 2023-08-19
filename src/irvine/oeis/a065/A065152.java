package irvine.oeis.a065;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065152 Cototient(totient(n)) - totient(cototient(n)).
 * @author Sean A. Irvine
 */
public class A065152 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z phi = Euler.phi(++mN);
    return phi.subtract(Euler.phi(phi)).subtract(Euler.phi(mN - phi.longValueExact()));
  }
}

