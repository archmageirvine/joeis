package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218328.
 * @author Sean A. Irvine
 */
public class A218328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218328() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 155, 885, 2639});
  }
}
