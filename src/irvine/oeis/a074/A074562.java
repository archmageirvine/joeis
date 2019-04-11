package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074562 <code>a(n) = 4^n + 5^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074562() {
    super(new long[] {140, -83, 16}, new long[] {3, 16, 90});
  }
}
