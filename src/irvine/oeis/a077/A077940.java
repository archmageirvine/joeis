package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077940.
 * @author Sean A. Irvine
 */
public class A077940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077940() {
    super(new long[] {-2, 0, 2}, new long[] {1, 2, 4});
  }
}
