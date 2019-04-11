package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120689 <code>a(n) = 10*a(n-1) - 16*a(n-2), n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A120689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120689() {
    super(new long[] {-16, 10}, new long[] {0, 3});
  }
}
