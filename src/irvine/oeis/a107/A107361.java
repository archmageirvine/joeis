package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107361.
 * @author Sean A. Irvine
 */
public class A107361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107361() {
    super(new long[] {-3, 4, 2}, new long[] {1, 2, 8});
  }
}
