package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074559 <code>a(n) = 3^n + 7^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074559() {
    super(new long[] {189, -111, 19}, new long[] {3, 19, 139});
  }
}
