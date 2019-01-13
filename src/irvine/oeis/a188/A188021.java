package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188021.
 * @author Sean A. Irvine
 */
public class A188021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188021() {
    super(new long[] {-1, -2, 3, 1}, new long[] {0, 0, 1, 1});
  }
}
