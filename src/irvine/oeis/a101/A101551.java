package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101551 <code>C(n-2,2)+C(n-5,5)+...+C(n-(3*floor((n-3)/3)+2),3*floor((n-3)/3)+2)</code>.
 * @author Sean A. Irvine
 */
public class A101551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101551() {
    super(new long[] {1, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 0, 1, 3});
  }
}
