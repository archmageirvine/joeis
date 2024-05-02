package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062789 a(n) = gcd(n, phi(n) * (phi(n) + 1)).
 * @author Sean A. Irvine
 */
public class A062789 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z phi = Functions.PHI.z(++mN);
    return phi.multiply(phi.add(1)).gcd(Z.valueOf(mN));
  }
}
