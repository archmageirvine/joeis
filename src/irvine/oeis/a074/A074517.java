package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074517 <code>a(n) = 1^n + 5^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074517() {
    super(new long[] {35, -47, 13}, new long[] {3, 13, 75});
  }
}
