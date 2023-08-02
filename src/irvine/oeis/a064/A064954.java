package irvine.oeis.a064;

import irvine.oeis.FilterPositionSequence;

/**
 * A064954 Positions of powers of 2 in A064413.
 * @author Sean A. Irvine
 */
public class A064954 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064954() {
    super(1, 1, new A064413(), k -> k.bitCount() == 1);
  }
}
