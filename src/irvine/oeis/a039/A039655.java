package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039655 Number of iterations of f(x) = sigma(x)-1 applied to n required to reach a prime, or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A039655 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    long c = 0;
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Cheetah.factor(m).sigma().subtract(1);
      ++c;
    }
    return Z.valueOf(c);
  }
}
