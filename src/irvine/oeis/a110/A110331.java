package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110331 Row sums of a number triangle related to the Pell numbers.
 * @author Sean A. Irvine
 */
public class A110331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110331() {
    super(new long[] {1, -3, 3}, new long[] {1, -1, -5});
  }
}
