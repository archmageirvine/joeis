package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080782.
 * @author Sean A. Irvine
 */
public class A080782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080782() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 2, 4});
  }
}
