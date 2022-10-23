package irvine.oeis.a039;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039651 Number of iterations of f(x) = phi(x)+1 on n required to reach a prime.
 * @author Sean A. Irvine
 */
public class A039651 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Euler.phi(m).add(1);
      ++c;
    }
    return Z.valueOf(c);
  }
}
