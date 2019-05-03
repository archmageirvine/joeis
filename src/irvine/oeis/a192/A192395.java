package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192395 Main (or principal) sequence for <code>a(n) = 2*a(n-1) - 2*a(n-2) + a(n-3) + 2*a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A192395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192395() {
    super(new long[] {2, 1, -2, 2}, new long[] {0, 0, 0, 1});
  }
}
