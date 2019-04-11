package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007493 Decimal expansion of Wallis' number, the real root of <code>x^3 - 2*x - 5</code>.
 * @author Sean A. Irvine
 */
public class A007493 extends DecimalExpansionSequence {

  private static final ComputableReals FLD = ComputableReals.SINGLETON;
  private static final CR SQRT = CR.valueOf(1929).sqrt();
  private static final CR THIRD = CR.ONE_THIRD;
  private static final CR N = FLD.pow(CR.valueOf(new Q(135, 2)).subtract(SQRT.multiply(CR.valueOf(new Q(3, 2)))), THIRD).multiply(THIRD)
    .add(FLD.pow(SQRT.add(CR.valueOf(45)).multiply(CR.HALF), THIRD).divide(FLD.pow(CR.THREE, CR.valueOf(new Q(2, 3)))));

  @Override
  protected CR getCR() {
    return N;
  }
}
