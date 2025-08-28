package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079833 Define f(n) = n + tau(n), then a(n) = smallest prime of the type f(f(f...f(n)))).
 * @author Sean A. Irvine
 */
public class A079833 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (true) {
      m = m.add(Functions.SIGMA0.z(m));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}

