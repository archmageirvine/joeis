package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203171 Alternating sum of the fourth powers of the first <code>n even-indexed</code> Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A203171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203171() {
    super(new long[] {-1, -55, -385, -385, -55}, new long[] {0, -1, 80, -4016, 190465});
  }
}
