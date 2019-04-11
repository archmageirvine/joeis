package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074558 <code>a(n) = 3^n + 7^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074558() {
    super(new long[] {168, -101, 18}, new long[] {3, 18, 122});
  }
}
