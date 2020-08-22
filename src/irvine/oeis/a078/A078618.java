package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078618 a(n) = floor(average of first n cubes).
 * @author Sean A. Irvine
 */
public class A078618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078618() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {1, 4, 12, 25, 45, 73, 112});
  }
}
