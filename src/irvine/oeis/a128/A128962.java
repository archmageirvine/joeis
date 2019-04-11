package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128962 <code>a(n) = (n^3 - n)*4^n</code>.
 * @author Sean A. Irvine
 */
public class A128962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128962() {
    super(new long[] {-256, 256, -96, 16}, new long[] {0, 96, 1536, 15360});
  }
}
