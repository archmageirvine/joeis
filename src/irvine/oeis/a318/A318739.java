package irvine.oeis.a318;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A318739 Decimal expansion of Pi^2 / 24 - (1/12) * log(2 + sqrt(5))^2.
 * @author Georg Fischer
 */
public class A318739 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A318739() {
    super(0, REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(24)).subtract(CR.ONE.divide(CR.valueOf(12)).multiply(REALS.pow(CR.TWO.add(CR.FIVE.sqrt()).log(), CR.TWO))));
  }
}
