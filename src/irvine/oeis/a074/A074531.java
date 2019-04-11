package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074531 <code>a(n) = 2^n + 3^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074531() {
    super(new long[] {54, -51, 14}, new long[] {3, 14, 94});
  }
}
