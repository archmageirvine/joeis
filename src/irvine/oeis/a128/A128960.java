package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128960 a(n) = (n^3 - n)*2^n.
 * @author Sean A. Irvine
 */
public class A128960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128960() {
    super(1, new long[] {-16, 32, -24, 8}, new long[] {0, 24, 192, 960});
  }
}
