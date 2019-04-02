package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128985 a(n) = (n^3 - n^2)*2^n.
 * @author Sean A. Irvine
 */
public class A128985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128985() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 16, 144, 768});
  }
}
