package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033445.
 * @author Sean A. Irvine
 */
public class A033445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033445() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 0, 5, 22});
  }
}
