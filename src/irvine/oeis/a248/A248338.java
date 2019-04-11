package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248338 <code>10^n - 4^n</code>.
 * @author Sean A. Irvine
 */
public class A248338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248338() {
    super(new long[] {-40, 14}, new long[] {0, 6});
  }
}
