package irvine.oeis.a274;
// Generated by gen_seq4.pl dex CR.SQRT2.divide(CR.TWO).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A274541 Decimal expansion of exp(sqrt(2)/2).
 * @author Georg Fischer
 */
public class A274541 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A274541() {
    super(CR.SQRT2.divide(CR.TWO).exp());
  }
}
