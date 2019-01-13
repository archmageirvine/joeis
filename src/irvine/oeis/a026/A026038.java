package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026038.
 * @author Sean A. Irvine
 */
public class A026038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026038() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {5, 11, 20, 33, 52, 78});
  }
}
