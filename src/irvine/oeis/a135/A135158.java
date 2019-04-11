package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135158 <code>a(n) = 5^n - 3^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A135158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135158() {
    super(new long[] {30, -31, 10}, new long[] {-1, 0, 12});
  }
}
