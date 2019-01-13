package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273375.
 * @author Sean A. Irvine
 */
public class A273375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273375() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {4, 64, 144, 324, 484});
  }
}
