package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027383.
 * @author Sean A. Irvine
 */
public class A027383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027383() {
    super(new long[] {-2, 2, 1}, new long[] {1, 2, 4});
  }
}
