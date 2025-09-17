package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388250 Decimal expansion of (1/2) * exp(Pi/3).
 * @author Sean A. Irvine
 */
public class A388250 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388250() {
    super(1, CR.PI.divide(3).exp().divide(2));
  }
}
