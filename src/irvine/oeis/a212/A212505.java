package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212505.
 * @author Sean A. Irvine
 */
public class A212505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212505() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 3, 14, 48, 114, 243, 444});
  }
}
