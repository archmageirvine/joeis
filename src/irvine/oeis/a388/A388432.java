package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388432 Decimal expansion of 6 * exp(-Pi) * sqrt(2) * (2+sqrt(2)).
 * @author Sean A. Irvine
 */
public class A388432 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388432() {
    super(1, CR.PI.negate().exp().multiply(6).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2)));
  }
}
