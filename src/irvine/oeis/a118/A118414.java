package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118414.
 * @author Sean A. Irvine
 */
public class A118414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118414() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 9, 35, 105});
  }
}
