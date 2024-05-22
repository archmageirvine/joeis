package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A039655 Number of iterations of f(x) = sigma(x)-1 applied to n required to reach a prime, or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A039655 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long c = 0;
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Functions.SIGMA1.z(m).subtract(1);
      ++c;
    }
    return Z.valueOf(c);
  }
}
