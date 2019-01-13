package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080412.
 * @author Sean A. Irvine
 */
public class A080412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080412() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 1, 3, 4});
  }
}
