package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214995 Power ceiling-floor sequence of (golden ratio)^6.
 * @author Sean A. Irvine
 */
public class A214995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214995() {
    super(new long[] {-1, 17, 17}, new long[] {18, 322, 5779});
  }
}
