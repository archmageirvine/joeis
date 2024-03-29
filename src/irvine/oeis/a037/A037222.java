package irvine.oeis.a037;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A037222 Decimal expansion of Pi*e^2.
 * @author Georg Fischer
 */
public class A037222 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A037222() {
    super(2, CR.PI.multiply(REALS.pow(CR.E, CR.TWO)));
  }
}
