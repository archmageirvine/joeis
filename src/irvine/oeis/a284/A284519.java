package irvine.oeis.a284;

import irvine.oeis.FiniteSequence;

/**
 * A284519 Number of elements of order n in the Suzuki group <code>Sz(32)</code>.
 * @author Sean A. Irvine
 */
public class A284519 extends FiniteSequence {

  // Could be done via OrdersFiniteGroupSequence, but too slow for Sz(32)

  /** Construct the sequence. */
  public A284519() {
    super(1, 31775, 0, 1016800, 1301504, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6507520, 0, 0, 0, 0, 0, 15744000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7936000);
  }
}

