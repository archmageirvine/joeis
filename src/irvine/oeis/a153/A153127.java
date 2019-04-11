package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153127 <code>a(n) = (2*n + 1)*(5*n + 6)</code>.
 * @author Sean A. Irvine
 */
public class A153127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153127() {
    super(new long[] {1, -3, 3}, new long[] {6, 33, 80});
  }
}
