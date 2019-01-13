package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143059.
 * @author Sean A. Irvine
 */
public class A143059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143059() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 46, 121, 252});
  }
}
