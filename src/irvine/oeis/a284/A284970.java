package irvine.oeis.a284;

import irvine.oeis.FiniteSequence;

/**
 * A284970 Number of elements of order n in the unitary group U3(8).
 * @author Sean A. Irvine
 */
public class A284970 extends FiniteSequence {

  // Could be done via OrdersFiniteGroupSequence, but too slow for U3(8)

  /** Construct the sequence. */
  public A284970() {
    super(1, FINITE, 1, 3591, 75392, 258552, 0, 459648, 787968, 0, 612864, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1741824, 0, 1575936);
  }
}

