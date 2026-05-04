package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394804 Decimal expansion of (4*log(2)-1)/(6*log(2)^2).
 * @author Sean A. Irvine
 */
public class A394804 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394804() {
    super(0, CR.LOG2.multiply(4).subtract(1).divide(CR.LOG2.square().multiply(6)));
  }
}
