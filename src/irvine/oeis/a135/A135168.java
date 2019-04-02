package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135168 a(n) = 7^n + 5^n + 3^n + 2^n.
 * @author Sean A. Irvine
 */
public class A135168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135168() {
    super(new long[] {-210, 247, -101, 17}, new long[] {4, 17, 87, 503});
  }
}
