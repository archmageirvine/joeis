package irvine.oeis.a329;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A329215 Decimal expansion of the fundamental frequency of the note G#4/Ab4 in hertz.
 * Formula: 220*2^(11/12)
 * @author Georg Fischer
 */
public class A329215 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A329215() {
    super(3, CR.valueOf(220).multiply(CR.TWO.pow(CR.valueOf(11).divide(CR.valueOf(12)))));
  }
}
