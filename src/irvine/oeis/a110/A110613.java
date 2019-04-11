package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110613 <code>a(n+3) = 5*a(n+2) - 2*a(n+1) - 8*a(n), a(0) = 1, a(1) = 0, a(2) = 3</code>.
 * @author Sean A. Irvine
 */
public class A110613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110613() {
    super(new long[] {-8, -2, 5}, new long[] {1, 0, 3});
  }
}
