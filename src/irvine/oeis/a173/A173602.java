package irvine.oeis.a173;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A173602 Decimal expansion of 2-e^(1/e).
 * @author Georg Fischer
 */
public class A173602 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A173602() {
    super(0, CR.TWO.subtract(REALS.pow(CR.E, CR.ONE.divide(CR.E))));
  }
}
