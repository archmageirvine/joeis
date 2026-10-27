package irvine.oeis.a087;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A087042 Decimal expansion of a number x such that adding Pi to each of the partial quotients of the continued fraction of x evaluates to x+3.
 * @author Sean A. Irvine
 */
public class A087042 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A087042() {
    super(0, new A087041());
  }
}
