package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388455 Decimal expansion of sqrt(2) * (2-sqrt(2))^(1/2).
 * @author Sean A. Irvine
 */
public class A388455 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388455() {
    super(1, CR.SQRT2.multiply(CR.TWO.subtract(CR.SQRT2).sqrt()));
  }
}
