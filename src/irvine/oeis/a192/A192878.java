package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192878.
 * @author Sean A. Irvine
 */
public class A192878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192878() {
    super(new long[] {-1, 2, 2}, new long[] {3, 0, 4});
  }
}
