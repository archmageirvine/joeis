package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002965.
 * @author Sean A. Irvine
 */
public class A002965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002965() {
    super(new long[] {1, 0, 2, 0}, new long[] {0, 1, 1, 1});
  }
}
