package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193867 Odd central polygonal numbers.
 * @author Sean A. Irvine
 */
public class A193867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193867() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 7, 11, 29, 37});
  }
}
