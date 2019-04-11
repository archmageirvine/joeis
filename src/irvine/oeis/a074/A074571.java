package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074571 <code>a(n) = 5^n + 6^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074571() {
    super(new long[] {210, -107, 18}, new long[] {3, 18, 110});
  }
}
