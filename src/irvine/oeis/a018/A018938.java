package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A018938 Decimal expansion of e^Pi - Pi.
 * @author Sean A. Irvine
 */
public class A018938 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A018938() {
    super(CR.PI.exp().subtract(CR.PI));
  }
}
