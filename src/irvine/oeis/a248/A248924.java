package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248924.
 * @author Sean A. Irvine
 */
public class A248924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248924() {
    super(new long[] {1, 3, 2, -1}, new long[] {2, 2, 1, 7});
  }
}
