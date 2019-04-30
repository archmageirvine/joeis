package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153973 <code>a(n+1) = 2*(a(n) - 2) - 2</code>, with <code>a(0)=9</code>.
 * @author Sean A. Irvine
 */
public class A153973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153973() {
    super(new long[] {-2, 3}, new long[] {9, 12});
  }
}
