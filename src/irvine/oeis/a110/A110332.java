package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110332 Diagonal sums of number a triangle related to the Pell numbers.
 * @author Sean A. Irvine
 */
public class A110332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110332() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, -2, -1, -4, -5, -6});
  }
}
