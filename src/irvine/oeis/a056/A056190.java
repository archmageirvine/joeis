package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056190 a(n) = Sum_{d|n and gcd(d, n/d)=1} binomial(n,d).
 * @author Georg Fischer
 */
public class A056190 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Functions.GCD.l((long) d, mN / d) == 1 ? Binomial.binomial(mN, d) : Z.ZERO);
  }
}
