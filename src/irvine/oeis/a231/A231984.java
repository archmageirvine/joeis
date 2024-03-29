package irvine.oeis.a231;
// Generated by gen_seq4.pl decexpr at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A231984 Decimal expansion of the solid angle (in deg^2) of a spherical square having sides of one degree.
 * Formula: 4*arcsin(sin(Pi/360)^2)*(180/Pi)^2
 * @author Georg Fischer
 */
public class A231984 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A231984() {
    super(0, CR.FOUR.multiply(REALS.asin(CR.PI.divide(CR.valueOf(360)).sin().pow(CR.TWO))).multiply(CR.valueOf(180).divide(CR.PI).pow(CR.TWO)));
  }
}
