package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167387.
 * @author Sean A. Irvine
 */
public class A167387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167387() {
    super(new long[] {-1, -5, -10, -10, -5}, new long[] {1, -2, 0, 10, -35});
  }
}
