package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002388 Decimal expansion of Pi^2.
 * @author Sean A. Irvine
 */
public class A002388 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002388() {
    super(CR.PI.multiply(CR.PI));
  }
}
