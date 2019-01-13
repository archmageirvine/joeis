package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055245.
 * @author Sean A. Irvine
 */
public class A055245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055245() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {1, 1, 5, 12, 28, 61});
  }
}
