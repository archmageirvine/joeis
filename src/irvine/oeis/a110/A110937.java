package irvine.oeis.a110;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A110937 Decimal expansion of cosecant of 1 degree.
 * @author Georg Fischer
 */
public class A110937 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A110937() {
    super(2, CR.ONE.divide(CR.PI.divide(CR.valueOf(180)).sin()));
  }
}
