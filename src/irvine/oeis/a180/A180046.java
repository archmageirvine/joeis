package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180046.
 * @author Sean A. Irvine
 */
public class A180046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180046() {
    super(new long[] {1, 1, -1, 1}, new long[] {1, 2, 3, 4});
  }
}
