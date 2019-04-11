package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153169 <code>a(n) = 4*n^2 + 12*n + 3</code>.
 * @author Sean A. Irvine
 */
public class A153169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153169() {
    super(new long[] {1, -3, 3}, new long[] {19, 43, 75});
  }
}
