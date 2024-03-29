package irvine.oeis.a232;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A232813 Decimal expansion of the minimum surface index of a closed cylinder.
 * Formula: (54*Pi)^(1/3)
 * @author Georg Fischer
 */
public class A232813 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A232813() {
    super(1, CR.valueOf(54).multiply(CR.PI).pow(CR.ONE.divide(CR.THREE)));
  }
}
