package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068466 Decimal expansion of Gamma(1/4).
 * @author Sean A. Irvine
 */
public class A068466 extends DecimalExpansionSequence {

  private static final ComputableReals FLD = ComputableReals.SINGLETON;

  /** The constant Gamma(1/4). */
  public static final CR GAMMA_QUARTER = FLD.pow(CR.TAU, CR.valueOf(new Q(3, 2)))
    .divide(CR.ONE.agm(CR.TWO.sqrt())).sqrt();

  /** Construct the sequence. */
  public A068466() {
    super(GAMMA_QUARTER);
  }
}
