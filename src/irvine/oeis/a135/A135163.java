package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135163 a(n) = 7^n - 5^n + 3^n - 2^n.
 * @author Sean A. Irvine
 */
public class A135163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135163() {
    super(new long[] {-210, 247, -101, 17}, new long[] {0, 3, 29, 237});
  }
}
