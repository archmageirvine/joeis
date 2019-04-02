package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048500 a(n) = 2^(n-1)*(7*n-12)+7.
 * @author Sean A. Irvine
 */
public class A048500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048500() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 11});
  }
}
