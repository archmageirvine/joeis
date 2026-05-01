package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002329 Periods of reciprocals of integers prime to 10.
 * @author Sean A. Irvine
 */
public class A394804 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394804() {
    super(0, CR.LOG2.multiply(4).subtract(1).divide(CR.LOG2.square().multiply(6)));
  }
}
