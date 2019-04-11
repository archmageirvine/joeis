package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074521 <code>a(n) = 1^n + 6^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074521() {
    super(new long[] {48, -62, 15}, new long[] {3, 15, 101});
  }
}
