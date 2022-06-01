package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052928 The even numbers repeated.
 * @author Sean A. Irvine
 */
public class A052928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052928() {
    super(new long[] {-1, 1, 1}, new long[] {0, 0, 2});
  }
}
