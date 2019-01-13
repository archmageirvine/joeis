package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193052.
 * @author Sean A. Irvine
 */
public class A193052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193052() {
    super(new long[] {60, -47, 12}, new long[] {-1, -2, 0});
  }
}
