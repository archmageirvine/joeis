package irvine.oeis.a179;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179047 Decimal expansion of 9*sqrt(3)/4, the area of an equilateral triangle of side length 3.
 * @author Georg Fischer
 */
public class A179047 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179047() {
    super(1, CR.NINE.multiply(CR.THREE.sqrt()).divide(CR.FOUR));
  }
}
