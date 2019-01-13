package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117472.
 * @author Sean A. Irvine
 */
public class A117472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117472() {
    super(new long[] {-1, 0, 6, 0}, new long[] {25, 53, 137, 305});
  }
}
