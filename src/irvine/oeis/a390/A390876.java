package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390876 Decimal expansion of Pi/2 + log(2) - 2.
 * @author Sean A. Irvine
 */
public class A390876 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390876() {
    super(1, CR.HALF_PI.add(CR.LOG2).subtract(2));
  }
}
