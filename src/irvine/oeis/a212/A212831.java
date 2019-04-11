package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212831 <code>a(4*n) = 2*n, a(2*n+1) = 2*n+1, a(4*n+2) = 2*n+2</code>.
 * @author Sean A. Irvine
 */
public class A212831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212831() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 1, 2, 3, 2, 5});
  }
}
