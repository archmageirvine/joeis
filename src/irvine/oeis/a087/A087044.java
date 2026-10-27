package irvine.oeis.a087;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A087044 Decimal expansion of a number x such that adding exp(1) to each of the partial quotients of the continued fraction of x evaluates to x+2.
 * @author Sean A. Irvine
 */
public class A087044 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A087044() {
    super(0, new A087043());
  }
}
