package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084120.
 * @author Sean A. Irvine
 */
public class A084120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084120() {
    super(new long[] {-3, 6}, new long[] {1, 3});
  }
}
