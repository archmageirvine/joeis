package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074565 <code>a(n) = 4^n + 6^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074565() {
    super(new long[] {168, -94, 17}, new long[] {3, 17, 101});
  }
}
