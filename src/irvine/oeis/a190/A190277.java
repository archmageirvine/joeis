package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190277.
 * @author Sean A. Irvine
 */
public class A190277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190277() {
    super(new long[] {-2, -3, 1, 3}, new long[] {1, 1, 2, 4});
  }
}
