package irvine.oeis.a058;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058663 a(n) = gcd(n-1, n-phi(n)).
 * @author Sean A. Irvine
 */
public class A058663 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.gcd(++mN - 1, mN - Functions.PHI.l(mN)));
  }
}
