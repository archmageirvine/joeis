package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123056.
 * @author Sean A. Irvine
 */
public class A123056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123056() {
    super(new long[] {-1, 40, -206, 40}, new long[] {0, 4, 108, 3500});
  }
}
