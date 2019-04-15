package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053138 Binomial coefficients <code>C(2*n+9,9)</code>.
 * @author Sean A. Irvine
 */
public class A053138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053138() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 55, 715, 5005, 24310, 92378, 293930, 817190, 2042975, 4686825});
  }
}
