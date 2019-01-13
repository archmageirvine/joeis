package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289804.
 * @author Sean A. Irvine
 */
public class A289804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289804() {
    super(new long[] {1, 9, -15, 7}, new long[] {1, 3, 9, 29});
  }
}
