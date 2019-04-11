package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074621 <code>a(n) = 6^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074621() {
    super(new long[] {-54, 15}, new long[] {2, 15});
  }
}
