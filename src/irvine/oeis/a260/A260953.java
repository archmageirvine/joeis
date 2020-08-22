package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260953 List of numbers of the forms (2^(4m+3)-3)/5 and (2^(12m+4)-3)/13 arranged in increasing order.
 * @author Sean A. Irvine
 */
public class A260953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260953() {
    super(new long[] {-4096, 0, 0, 0, 4097, 0, 0, 0}, new long[] {1, 1, 25, 409, 5041, 6553, 104857, 1677721});
  }
}
