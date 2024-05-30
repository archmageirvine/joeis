package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058665 a(n) = gcd(n+1, n-phi(n)).
 * @author Sean A. Irvine
 */
public class A058665 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GCD.z(++mN + 1, mN - Functions.PHI.l(mN));
  }
}
