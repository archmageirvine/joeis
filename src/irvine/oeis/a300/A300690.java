package irvine.oeis.a300;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A300690 Decimal expansion of sqrt(Pi^2/8 - 1).
 * @author Georg Fischer
 */
public class A300690 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A300690() {
    super(0, REALS.pow(CR.PI, CR.TWO).divide(CR.EIGHT).subtract(CR.ONE).sqrt());
  }
}
