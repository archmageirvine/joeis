package irvine.oeis.a284;

import irvine.oeis.FiniteSequence;

/**
 * A284925 Number of elements of order n in the exceptional group G_2(3).
 * @author Sean A. Irvine
 */
public class A284925 extends FiniteSequence {

  // Could be done via OrdersFiniteGroupSequence, but too slow for G_2(3)

  /** Construct the sequence. */
  public A284925() {
    super(1, FINITE, 1, 7371, 59696, 88452, 0, 589680, 606528, 1061424, 471744, 0, 0, 707616, 653184);
  }
}

