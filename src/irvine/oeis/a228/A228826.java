package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228826 Delayed continued fraction of sqrt(2).
 * @author Sean A. Irvine
 */
public class A228826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228826() {
    super(new long[] {-1, 0}, new long[] {2, -1});
  }
}
