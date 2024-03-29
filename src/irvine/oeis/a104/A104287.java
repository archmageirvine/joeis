package irvine.oeis.a104;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104287 Decimal expansion of log base phi of 2.
 * @author Georg Fischer
 */
public class A104287 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104287() {
    super(1, CR.TWO.log().divide(CR.FIVE.sqrt().add(CR.ONE).divide(CR.TWO).log()));
  }
}
