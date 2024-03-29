package irvine.oeis.a258;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A258148 Decimal expansion of (2 - 3*sqrt(3)/Pi)/6: ratio of the area of a circular segment with central angle Pi/3 and the area of the corresponding circular half-disk.
 * @author Georg Fischer
 */
public class A258148 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A258148() {
    super(-1, CR.TWO.subtract(CR.THREE.multiply(CR.THREE.sqrt()).divide(CR.PI)).divide(CR.SIX));
  }
}
