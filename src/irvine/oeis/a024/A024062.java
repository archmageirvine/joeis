package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024062 <code>a(n) = 6^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A024062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024062() {
    super(new long[] {-6, 7}, new long[] {0, 5});
  }
}
