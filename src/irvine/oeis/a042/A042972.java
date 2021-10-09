package irvine.oeis.a042;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A042972 Decimal expansion of i^(-i), where i = sqrt(-1).
 * @author Sean A. Irvine
 */
public class A042972 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A042972() {
    super(CR.HALF_PI.exp());
  }
}
