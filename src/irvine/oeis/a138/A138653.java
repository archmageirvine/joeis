package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138653 <code>a(n) = 3*a(n-1)-3*a(n-2)+a(n-3)+a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A138653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138653() {
    super(new long[] {1, 1, -3, 3}, new long[] {1, 2, 4, 8});
  }
}
