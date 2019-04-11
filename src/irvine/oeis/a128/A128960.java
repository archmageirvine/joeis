package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128960 <code>a(n) = (n^3 - n)*2^n</code>.
 * @author Sean A. Irvine
 */
public class A128960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128960() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 24, 192, 960});
  }
}
