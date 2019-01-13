package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289643.
 * @author Sean A. Irvine
 */
public class A289643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289643() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 20, 70, 180});
  }
}
