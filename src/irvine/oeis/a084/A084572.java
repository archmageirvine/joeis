package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084572 Let a(1)=1; for n&gt;1, a(n)=nextprime((Pi/2)*a(n-1)).
 * @author Sean A. Irvine
 */
public class A084572 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Functions.NEXT_PRIME.z(CR.HALF_PI.multiply(mA).floor());
    return mA;
  }
}

