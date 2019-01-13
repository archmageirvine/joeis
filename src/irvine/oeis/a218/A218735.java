package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218735.
 * @author Sean A. Irvine
 */
public class A218735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218735() {
    super(new long[] {-1, 0, 3, 0}, new long[] {5, 6, 9, 13});
  }
}
