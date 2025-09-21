package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388697 Decimal expansion of (1/8) * exp(Pi) / Pi.
 * @author Sean A. Irvine
 */
public class A388697 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388697() {
    super(0, CR.PI.exp().divide(8).divide(CR.PI));
  }
}
