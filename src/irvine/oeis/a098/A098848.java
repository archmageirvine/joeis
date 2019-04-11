package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098848 <code>a(n) = n*(n + 14)</code>.
 * @author Sean A. Irvine
 */
public class A098848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098848() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 32});
  }
}
