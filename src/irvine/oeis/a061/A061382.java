package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A061382 Decimal expansion of Pi/e.
 * @author Sean A. Irvine
 */
public class A061382 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A061382() {
    super(CR.PI.divide(CR.E));
  }
}
