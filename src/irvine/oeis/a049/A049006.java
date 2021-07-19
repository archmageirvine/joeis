package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A049006 Decimal expansion of i^i = exp(-Pi/2).
 * @author Sean A. Irvine
 */
public class A049006 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A049006() {
    super(CR.PI.negate().divide(CR.TWO).exp());
  }
}
