package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135165 <code>a(n) = 7^n + 5^n - 3^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A135165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135165() {
    super(new long[] {-210, 247, -101, 17}, new long[] {0, 7, 61, 433});
  }
}
