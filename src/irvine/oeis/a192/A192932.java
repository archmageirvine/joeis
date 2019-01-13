package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192932.
 * @author Sean A. Irvine
 */
public class A192932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192932() {
    super(new long[] {-1, 1, -1, 1, 1, 1}, new long[] {9, 0, 4, 9, 4, 25});
  }
}
