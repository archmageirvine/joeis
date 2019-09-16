package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053741 Sum of even numbers in range <code>10*n</code> to <code>10*n+9</code>.
 * @author Sean A. Irvine
 */
public class A053741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053741() {
    super(new long[] {-1, 2}, new long[] {20, 70});
  }
}
