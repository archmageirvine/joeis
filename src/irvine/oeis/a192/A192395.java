package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192395 a(n) = 2*a(n-1) - 2*a(n-2) + a(n-3) + 2*a(n-4) starting with a(0..3) = 0, 0, 0, 1.
 * @author Sean A. Irvine
 */
public class A192395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192395() {
    super(new long[] {2, 1, -2, 2}, new long[] {0, 0, 0, 1});
  }
}
