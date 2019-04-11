package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074610 <code>a(n) = 3^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074610() {
    super(new long[] {-27, 12}, new long[] {2, 12});
  }
}
