package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188496.
 * @author Sean A. Irvine
 */
public class A188496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188496() {
    super(new long[] {-1, -3, -3, -5, -9, -7, 3, 19, 21, 13, 3, 3, 1}, new long[] {0, 0, 2, 4, 10, 28, 96, 304, 928, 2784, 8504, 26124, 80228});
  }
}
