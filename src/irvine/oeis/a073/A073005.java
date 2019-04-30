package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073005 Decimal expansion of <code>Gamma(1/3)</code>.
 * @author Sean A. Irvine
 */
public class A073005 extends DecimalExpansionSequence {

  private static final ComputableReals FLD = ComputableReals.SINGLETON;

  /** The constant Gamma(1/3). */
  public static final CR GAMMA_THIRD = FLD.pow(CR.TWO, CR.valueOf(new Q(7, 9)))
    .multiply(FLD.pow(CR.PI, CR.valueOf(new Q(2, 3))))
    .divide(FLD.pow(CR.THREE, CR.valueOf(new Q(1, 12))))
    .divide(FLD.pow(CR.TWO.agm(CR.THREE.sqrt().add(CR.TWO).sqrt()), CR.valueOf(new Q(1, 3))));

  @Override
  protected CR getCR() {
    return GAMMA_THIRD;
  }
}
