package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074563 <code>a(n) = 4^n + 5^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074563() {
    super(new long[] {160, -92, 17}, new long[] {3, 17, 105});
  }
}
