package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058207 Three steps forward, two steps back.
 * @author Sean A. Irvine
 */
public class A058207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058207() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 2, 1});
  }
}
