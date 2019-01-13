package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225828.
 * @author Sean A. Irvine
 */
public class A225828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225828() {
    super(new long[] {-256, 16, 16}, new long[] {1, 10, 76});
  }
}
