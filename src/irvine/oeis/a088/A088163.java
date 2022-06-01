package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088163 Numbers for which rotating one binary place to the right less rotating one binary place to the left is equal to zero.
 * @author Sean A. Irvine
 */
public class A088163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088163() {
    super(new long[] {-4, 0, 0, 5, 0, 0}, new long[] {0, 1, 2, 3, 7, 10});
  }
}
