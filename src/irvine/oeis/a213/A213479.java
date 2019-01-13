package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213479.
 * @author Sean A. Irvine
 */
public class A213479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213479() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 11, 18, 30});
  }
}
