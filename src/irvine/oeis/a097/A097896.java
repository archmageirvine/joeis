package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097896.
 * @author Sean A. Irvine
 */
public class A097896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097896() {
    super(new long[] {-2, -2, 3, 1}, new long[] {1, 2, 2, 5});
  }
}
