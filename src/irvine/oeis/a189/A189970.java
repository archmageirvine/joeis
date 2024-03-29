package irvine.oeis.a189;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A189970 Decimal expansion of (1 + x + sqrt(14+10*x))/4, where x=sqrt(5).
 * @author Georg Fischer
 */
public class A189970 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A189970() {
    super(1, CR.ONE.add(CR.FIVE.sqrt()).add(CR.valueOf(14).add(CR.TEN.multiply(CR.FIVE.sqrt())).sqrt()).divide(CR.FOUR));
  }
}
