package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244636.
 * @author Sean A. Irvine
 */
public class A244636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244636() {
    super(new long[] {1, -3, 3}, new long[] {0, 30, 120});
  }
}
