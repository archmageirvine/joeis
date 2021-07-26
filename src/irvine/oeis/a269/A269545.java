package irvine.oeis.a269;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A269545 Decimal expansion of Gamma(Pi).
 * @author Sean A. Irvine
 */
public class A269545 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A269545() {
    super(CR.PI.gamma());
  }
}
