package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118375.
 * @author Sean A. Irvine
 */
public class A118375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118375() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {1, 5, 11, 20, 35, 57});
  }
}
