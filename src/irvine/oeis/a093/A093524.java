package irvine.oeis.a093;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093524 Decimal expansion of 3977/216000 - Pi^2/2160.
 * @author Georg Fischer
 */
public class A093524 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A093524() {
    super(0, CR.valueOf(3977).divide(CR.valueOf(216000)).subtract(REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(2160))));
  }
}
