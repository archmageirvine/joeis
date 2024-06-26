package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A221209 Decimal expansion of two times the Catalan constant.
 * Formula:
 * @author Georg Fischer
 */
public class A221209 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A221209() {
    super(1, CR.TWO.multiply(new A006752().getCR()));
  }
}
