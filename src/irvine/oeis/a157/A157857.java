package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157857.
 * @author Sean A. Irvine
 */
public class A157857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157857() {
    super(new long[] {1, -3, 3}, new long[] {3599, 14398, 32397});
  }
}
