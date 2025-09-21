package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388758 Decimal expansion of (1/100) * exp(-Pi) * (5+5^(1/2))^4.
 * @author Sean A. Irvine
 */
public class A388758 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388758() {
    super(1, CR.PI.negate().exp().divide(100).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(4)));
  }
}
