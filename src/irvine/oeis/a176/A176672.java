package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176672.
 * @author Sean A. Irvine
 */
public class A176672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176672() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 7, 5, 13, 4, 19, 11});
  }
}
