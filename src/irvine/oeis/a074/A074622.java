package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074622 <code>a(n) = 7^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074622() {
    super(new long[] {-56, 15}, new long[] {2, 15});
  }
}
