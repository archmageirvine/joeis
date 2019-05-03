package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014925 Number of zeros in numbers 1 to <code>111...1 (n+1</code> digits).
 * @author Sean A. Irvine
 */
public class A014925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014925() {
    super(new long[] {100, -120, 21}, new long[] {1, 21, 321});
  }
}
