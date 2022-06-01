package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135166 a(n) = 7^n + 5^n - 3^n + 2^n.
 * @author Sean A. Irvine
 */
public class A135166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135166() {
    super(new long[] {-210, 247, -101, 17}, new long[] {2, 11, 69, 449});
  }
}
