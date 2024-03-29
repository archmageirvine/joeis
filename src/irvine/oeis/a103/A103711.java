package irvine.oeis.a103;
// Generated by gen_seq4.pl decexp at 2021-07-25 17:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A103711 Decimal expansion of the ratio of the length of the latus rectum arc of any parabola to its latus rectum: (sqrt(2) + log(1 + sqrt(2)))/2.
 * Formula: (sqrt(2)+log(1+sqrt(2)))/2
 * @author Georg Fischer
 */
public class A103711 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A103711() {
    super(1, CR.TWO.sqrt().add(CR.ONE.add(CR.TWO.sqrt()).log()).divide(CR.TWO));
  }
}
