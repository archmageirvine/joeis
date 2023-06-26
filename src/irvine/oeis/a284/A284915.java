package irvine.oeis.a284;

import irvine.oeis.FiniteSequence;

/**
 * A284915 Number of elements of order n in simple Higman-Sims group HS.
 * @author Sean A. Irvine
 */
public class A284915 extends FiniteSequence {

  // Could be done via OrdersFiniteGroupSequence, but too slow for HS

  /** Construct the sequence. */
  public A284915() {
    super(1, FINITE, 1, 21175, 123200, 877800, 2010624, 3080000, 6336000, 8316000, 0, 4435200, 8064000, 3696000, 0, 0, 2956800, 0, 0, 0, 0, 4435200);
  }
}

