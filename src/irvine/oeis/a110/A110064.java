package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110064 <code>a(n+4) = a(n+1) - a(n), a(0) = 1, a(1) = -4, a(2) = 0, a(3) = 1</code>.
 * @author Sean A. Irvine
 */
public class A110064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110064() {
    super(new long[] {-1, 1, 0, 0}, new long[] {1, -4, 0, 1});
  }
}
