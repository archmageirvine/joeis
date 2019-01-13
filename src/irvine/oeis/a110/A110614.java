package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110614.
 * @author Sean A. Irvine
 */
public class A110614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110614() {
    super(new long[] {-8, -2, 5}, new long[] {1, 5, 15});
  }
}
