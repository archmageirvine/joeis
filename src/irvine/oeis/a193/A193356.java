package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193356.
 * @author Sean A. Irvine
 */
public class A193356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193356() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 3, 0});
  }
}
