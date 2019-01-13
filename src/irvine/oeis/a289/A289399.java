package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289399.
 * @author Sean A. Irvine
 */
public class A289399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289399() {
    super(new long[] {9, -15, 7}, new long[] {0, 3, 21});
  }
}
