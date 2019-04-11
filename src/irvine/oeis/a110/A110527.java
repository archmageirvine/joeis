package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110527 <code>a(n+3) = 3*a(n+2) + 5*a(n+1) + a(n), a(0) = 0, a(1) = 1, a(2) = 8</code>.
 * @author Sean A. Irvine
 */
public class A110527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110527() {
    super(new long[] {1, 5, 3}, new long[] {0, 1, 8});
  }
}
