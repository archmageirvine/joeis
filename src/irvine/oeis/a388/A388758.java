package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388758 Decimal expansion of 2 * (7+3 * sqrt(5)) * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388758 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388758() {
    super(1, CR.PI.negate().exp().divide(100).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(4)));
  }
}
