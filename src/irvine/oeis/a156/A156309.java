package irvine.oeis.a156;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A156309 Decimal expansion of the absolute value of the larger solution of (n^2+n)/2 = -1/12. (Real root q of 6n^2 + 6n + 1, the other root being p = -1-q.).
 * @author Georg Fischer
 */
public class A156309 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156309() {
    super(0, CR.THREE.subtract(CR.THREE.sqrt()).divide(CR.SIX));
  }
}
