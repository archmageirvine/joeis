package irvine.oeis.a266;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A266814 Decimal expansion of -sqrt(2)*arctan(sqrt(2)/5) + Pi*sqrt(2)/4.
 * @author Georg Fischer
 */
public class A266814 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A266814() {
    super(0, CR.ZERO.subtract(CR.SQRT2.multiply(REALS.atan(CR.SQRT2.divide(CR.FIVE)))).add(CR.PI.multiply(CR.SQRT2).divide(CR.FOUR)));
  }
}
