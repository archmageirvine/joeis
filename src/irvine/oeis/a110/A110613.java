package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110613.
 * @author Sean A. Irvine
 */
public class A110613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110613() {
    super(new long[] {-8, -2, 5}, new long[] {1, 0, 3});
  }
}
