package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101552 C(n-3,3)+C(n-7,7)+...+C(n-(4*floor((n-4)/4)+3),4*floor((n-4)/4)+3).
 * @author Sean A. Irvine
 */
public class A101552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101552() {
    super(new long[] {1, 0, 0, 0, -1, 4, -6, 4}, new long[] {0, 0, 0, 0, 0, 0, 1, 4});
  }
}
