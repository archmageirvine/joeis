package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096951 Sum of odd powers of 2 and of 3 divided by 5.
 * @author Sean A. Irvine
 */
public class A096951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096951() {
    super(new long[] {-36, 13}, new long[] {1, 7});
  }
}
