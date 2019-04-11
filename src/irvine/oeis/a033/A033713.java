package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033713 Number of zeros in numbers 1 to <code>999..9 (n</code> digits).
 * @author Sean A. Irvine
 */
public class A033713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033713() {
    super(new long[] {100, -120, 21}, new long[] {0, 9, 189});
  }
}
