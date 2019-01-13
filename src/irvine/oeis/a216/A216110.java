package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216110.
 * @author Sean A. Irvine
 */
public class A216110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216110() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 198, 621, 1404});
  }
}
