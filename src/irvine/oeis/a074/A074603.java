package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074603 <code>a(n) = 2^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074603() {
    super(new long[] {-16, 10}, new long[] {2, 10});
  }
}
