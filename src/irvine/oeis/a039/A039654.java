package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039654 a(n) = prime reached by iterating f(x) = sigma(x)-1 starting at n, or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A039654 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Jaguar.factor(m).sigma().subtract(1);
    }
    return m;
  }
}
