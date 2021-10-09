package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A053510 Decimal expansion of log(Pi).
 * @author Sean A. Irvine
 */
public class A053510 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A053510() {
    super(CR.PI.log());
  }
}
