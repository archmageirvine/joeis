package irvine.oeis.a284;

import irvine.oeis.FiniteSequence;

/**
 * A284872 Number of elements of order n in simple Mathieu group M_23.
 * @author Sean A. Irvine
 */
public class A284872 extends FiniteSequence {

  // Could be done via OrdersFiniteGroupSequence, but too slow for M23

  /** Construct the sequence. */
  public A284872() {
    super(1, 3795, 56672, 318780, 680064, 850080, 1457280, 1275120, 0, 0, 1854720, 0, 0, 1457280, 1360128, 0, 0, 0, 0, 0, 0, 0, 887040);
  }
}

