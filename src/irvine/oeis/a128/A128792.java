package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128792.
 * @author Sean A. Irvine
 */
public class A128792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128792() {
    super(new long[] {-1296, 864, -216, 24}, new long[] {0, 6, 288, 5832});
  }
}
