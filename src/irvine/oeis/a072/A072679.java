package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072679 a(n) = (3*(n-1)+3)! *(3*(n-1)+6)! *2F2(3*n+1,3*n+4; 4,7; 1)/( 3! *6! *exp(1)), where 2F2(;;) is the generalized hypergeometric series.
 * @author Sean A. Irvine
 */
public class A072679 extends Sequence1 {

  private static final CR[] LOWER = {CR.FOUR, CR.SEVEN};
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z f = Functions.FACTORIAL.z(3 * (mN - 1) + 3).multiply(Functions.FACTORIAL.z(3 * (mN - 1) + 6)).divide(4320);
    return ComputableReals.SINGLETON.hypergeometric(new CR[]{CR.valueOf(3 * mN + 1), CR.valueOf(3 * mN + 4)}, LOWER, CR.ONE).multiply(f).divide(CR.E).assumeInt().toZ();
  }
}
