package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388592 Decimal expansion of 4 * (4+3 * sqrt(2)) * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388592 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388592() {
    super(1, CR.PI.negate().exp().multiply(2).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2).square()));
  }
}
