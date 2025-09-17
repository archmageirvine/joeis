package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388371 Decimal expansion of (1/64) * exp(2 * Pi).
 * @author Sean A. Irvine
 */
public class A388371 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388371() {
    super(1, CR.TAU.exp().divide(64));
  }
}
