package irvine.oeis.a190;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A190258 Decimal expansion of (x + sqrt(2 + 4x))/2, where x=sqrt(2).
 * @author Georg Fischer
 */
public class A190258 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A190258() {
    super(1, CR.TWO.sqrt().add(CR.TWO.add(CR.FOUR.multiply(CR.TWO.sqrt())).sqrt()).divide(CR.TWO));
  }
}
