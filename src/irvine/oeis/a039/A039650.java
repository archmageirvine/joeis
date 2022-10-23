package irvine.oeis.a039;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039650 Prime reached by iterating f(x) = phi(x)+1 on n.
 * @author Sean A. Irvine
 */
public class A039650 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Euler.phi(m).add(1);
    }
    return m;
  }
}
