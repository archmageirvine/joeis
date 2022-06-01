package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128991 a(n) = (n^3 - n^2)*8^n.
 * @author Sean A. Irvine
 */
public class A128991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128991() {
    super(new long[] {-4096, 2048, -384, 32}, new long[] {0, 256, 9216, 196608});
  }
}
