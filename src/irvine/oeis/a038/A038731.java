package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038731.
 * @author Sean A. Irvine
 */
public class A038731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038731() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 3, 10, 32});
  }
}
