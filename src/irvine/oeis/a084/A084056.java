package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084056.
 * @author Sean A. Irvine
 */
public class A084056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084056() {
    super(new long[] {1, 1, -1}, new long[] {0, 1, -3});
  }
}
