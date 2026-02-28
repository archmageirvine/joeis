package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392464 Decimal expansion of the area of an 18-gon with unit side lengths.
 * @author Sean A. Irvine
 */
public class A392464 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392464() {
    super(2, CR.NINE.divide(CR.PI.divide(18).tan().multiply(2)));
  }
}
