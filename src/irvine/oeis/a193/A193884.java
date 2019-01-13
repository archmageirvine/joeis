package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193884.
 * @author Sean A. Irvine
 */
public class A193884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193884() {
    super(new long[] {-1, 0, 0, 1}, new long[] {1, 1, 0, 0});
  }
}
