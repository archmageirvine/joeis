package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388745 Decimal expansion of 2 * sqrt(2 * (2+sqrt(2))) * exp(-Pi/2).
 * @author Sean A. Irvine
 */
public class A388745 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388745() {
    super(1, CR.HALF_PI.negate().exp().multiply(2).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2).sqrt()));
  }
}
