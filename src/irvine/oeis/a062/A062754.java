package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062754 a(n) = gcd(n, sigma(n+1)).
 * @author Sean A. Irvine
 */
public class A062754 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN + 1).sigma().gcd(Z.valueOf(mN));
  }
}

