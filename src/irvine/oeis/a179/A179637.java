package irvine.oeis.a179;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179637 Decimal expansion of the surface area of pentagonal rotunda with edge length 1.
 * @author Georg Fischer
 */
public class A179637 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179637() {
    super(2, CR.FIVE.multiply(CR.valueOf(145).add(CR.valueOf(58).multiply(CR.FIVE.sqrt())).add(CR.TWO.multiply(CR.valueOf(30).multiply(CR.valueOf(65).add(CR.valueOf(29).multiply(CR.FIVE.sqrt()))).sqrt()))).sqrt().divide(CR.TWO));
  }
}
