package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218985.
 * @author Sean A. Irvine
 */
public class A218985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218985() {
    super(new long[] {-2, -2, 5}, new long[] {5, 23, 103});
  }
}
