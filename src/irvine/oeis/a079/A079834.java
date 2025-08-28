package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079834 Define f(n)= n + tau(n), then a(n) = k where k is the number of steps required to get the smallest prime of the form f(f(f...f(n)))).
 * @author Sean A. Irvine
 */
public class A079834 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      ++k;
      m = m.add(Functions.SIGMA0.z(m));
      if (m.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

