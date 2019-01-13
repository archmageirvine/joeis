package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045883.
 * @author Sean A. Irvine
 */
public class A045883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045883() {
    super(new long[] {-4, 0, 3}, new long[] {0, 1, 3});
  }
}
