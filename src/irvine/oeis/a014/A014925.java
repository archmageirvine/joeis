package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014925 Number of zeros in numbers 1 to 111...1 (n+1 digits).
 * @author Sean A. Irvine
 */
public class A014925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014925() {
    super(1, new long[] {100, -120, 21}, new long[] {1, 21, 321});
  }
}
