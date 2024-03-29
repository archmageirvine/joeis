package irvine.oeis.a257;
// Generated by gen_seq4.pl decexp at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A257872 Decimal expansion of the Madelung type constant C(4|1) (negated).
 * Formula: 8*log(2)
 * @author Georg Fischer
 */
public class A257872 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A257872() {
    super(1, CR.EIGHT.multiply(CR.TWO.log()));
  }
}
