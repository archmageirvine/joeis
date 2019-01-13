package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193669.
 * @author Sean A. Irvine
 */
public class A193669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193669() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 0, 0, 0, 0});
  }
}
