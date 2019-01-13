package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063489.
 * @author Sean A. Irvine
 */
public class A063489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063489() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 30, 77});
  }
}
