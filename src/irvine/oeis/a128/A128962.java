package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128962 a(n) = (n^3 - n)*4^n.
 * @author Sean A. Irvine
 */
public class A128962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128962() {
    super(new long[] {-256, 256, -96, 16}, new long[] {0, 96, 1536, 15360});
  }
}
