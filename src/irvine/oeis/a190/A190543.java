package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190543 a(n) = 8^n - 3^n.
 * @author Sean A. Irvine
 */
public class A190543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190543() {
    super(new long[] {-24, 11}, new long[] {0, 5});
  }
}
