package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042127.
 * @author Sean A. Irvine
 */
public class A042127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042127() {
    super(new long[] {-1, 0, 194, 0}, new long[] {1, 4, 193, 776});
  }
}
