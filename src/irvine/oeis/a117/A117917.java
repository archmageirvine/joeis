package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117917.
 * @author Sean A. Irvine
 */
public class A117917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117917() {
    super(new long[] {1, 1, -6, 5}, new long[] {1, 4, 15, 52});
  }
}
