package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388594 Decimal expansion of 8 * exp(-Pi) * (2+sqrt(2)).
 * @author Sean A. Irvine
 */
public class A388594 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388594() {
    super(1, CR.PI.negate().exp().multiply(8).multiply(CR.TWO.add(CR.SQRT2)));
  }
}
