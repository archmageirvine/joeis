package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388622 Decimal expansion of 4 - 2*sqrt(2).
 * @author Sean A. Irvine
 */
public class A388622 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388622() {
    super(1, CR.FOUR.subtract(CR.SQRT2.multiply(2)));
  }
}
