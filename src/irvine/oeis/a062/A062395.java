package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062395 <code>a(n) = 8^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A062395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062395() {
    super(new long[] {-8, 9}, new long[] {2, 9});
  }
}
