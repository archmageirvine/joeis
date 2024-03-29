package irvine.oeis.a131;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A131917 Decimal expansion of 1 / (1 - gamma - log(3/2)) - 54, where gamma is the Euler-Mascheroni constant.
 * @author Georg Fischer
 */
public class A131917 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A131917() {
    super(1, CR.ONE.divide(CR.ONE.subtract(CR.GAMMA).subtract(CR.THREE.divide(CR.TWO).log())).subtract(CR.valueOf(54)));
  }
}
