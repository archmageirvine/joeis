package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388890 Decimal expansion of (1/16) * exp(Pi / 2) * sqrt(2) * (2+sqrt(2)).
 * @author Sean A. Irvine
 */
public class A388890 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388890() {
    super(1, CR.HALF_PI.exp().divide(16).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2)));
  }
}
