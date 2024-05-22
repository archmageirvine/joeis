package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A039654 a(n) = prime reached by iterating f(x) = sigma(x)-1 starting at n, or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A039654 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Functions.SIGMA1.z(m).subtract(1);
    }
    return m;
  }
}
