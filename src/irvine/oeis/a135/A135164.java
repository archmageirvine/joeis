package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135164 a(n) = 7^n - 5^n + 3^n + 2^n.
 * @author Sean A. Irvine
 */
public class A135164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135164() {
    super(new long[] {-210, 247, -101, 17}, new long[] {2, 7, 37, 253});
  }
}
