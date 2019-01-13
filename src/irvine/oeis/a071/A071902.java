package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071902.
 * @author Sean A. Irvine
 */
public class A071902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071902() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-1, 5, 65, 306, 975, 2479});
  }
}
