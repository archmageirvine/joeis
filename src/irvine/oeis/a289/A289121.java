package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289121.
 * @author Sean A. Irvine
 */
public class A289121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289121() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 4, 5, 12, 37});
  }
}
