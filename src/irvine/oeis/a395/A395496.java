package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395496 a(n) = Sum_{d|n} gcd(d,n/d)*mu(d).
 * @author Sean A. Irvine
 */
public class A395496 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.GCD.z(d, mN / d).multiply(Functions.MOBIUS.l(d)));
  }
}
