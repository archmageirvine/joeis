package irvine.oeis.a064;

import irvine.oeis.DifferenceSequence;

/**
 * A064426 First differences of A064413.
 * @author Sean A. Irvine
 */
public class A064426 extends DifferenceSequence {

  /** Construct the sequence. */
  public A064426() {
    super(1, new A064413());
  }
}
