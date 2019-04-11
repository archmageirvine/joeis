package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074564 <code>a(n) = 4^n + 5^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074564() {
    super(new long[] {180, -101, 18}, new long[] {3, 18, 122});
  }
}
