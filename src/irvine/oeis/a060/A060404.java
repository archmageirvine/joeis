package irvine.oeis.a060;

import irvine.math.LongUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000346;

/**
 * A060404 G.f.: Sum_{k &gt;= 1} (phi(k)/k)*log(1-f(x^k)), where f(x) = (1 - sqrt(1 - 4*x)) / (2*x) - 1 is the g.f. for the Catalan numbers (A000108) C_1, C_2, C_3, ...
 * @author Sean A. Irvine
 */
public class A060404 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000346());
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Integers.SINGLETON.sumdiv(mN, d -> mA.a(d - 1).multiply(LongUtils.phi(mN / d))).divide(mN);
  }
}
