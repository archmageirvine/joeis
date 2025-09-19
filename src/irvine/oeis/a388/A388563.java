package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388563 Decimal expansion of (1/2) * exp(Pi).
 * @author Sean A. Irvine
 */
public class A388563 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388563() {
    super(2, CR.PI.exp().divide(2));
  }
}
