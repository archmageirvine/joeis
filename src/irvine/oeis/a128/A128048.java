package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128048 (n^3+n)*8^n.
 * @author Sean A. Irvine
 */
public class A128048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128048() {
    super(new long[] {-4096, 2048, -384, 32}, new long[] {16, 640, 15360, 278528});
  }
}
