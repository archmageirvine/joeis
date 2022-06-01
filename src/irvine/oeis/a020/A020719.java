package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020719 a(n) = n+7.
 * @author Sean A. Irvine
 */
public class A020719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020719() {
    super(new long[] {-1, 2}, new long[] {7, 8});
  }
}
