package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388593 Decimal expansion of 8 * (1+sqrt(2)) * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388593 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388593() {
    super(0, CR.PI.negate().exp().multiply(4).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2)));
  }
}
