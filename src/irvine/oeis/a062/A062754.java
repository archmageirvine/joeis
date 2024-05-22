package irvine.oeis.a062;

import irvine.math.function.Functions;
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
    return Functions.SIGMA1.z(++mN + 1).gcd(Z.valueOf(mN));
  }
}

