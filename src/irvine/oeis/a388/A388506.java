package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388506 Decimal expansion of ((-1+sqrt(2)) * exp(Pi)) / 8.
 * @author Sean A. Irvine
 */
public class A388506 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388506() {
    super(1, CR.PI.exp().divide(-16).multiply(CR.SQRT2).multiply(CR.SQRT2.subtract(2)));
  }
}
