package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074555 <code>a(n) = 3^n + 6^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074555() {
    super(new long[] {126, -81, 16}, new long[] {3, 16, 94});
  }
}
