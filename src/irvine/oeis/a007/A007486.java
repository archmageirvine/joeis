package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007486.
 * @author Sean A. Irvine
 */
public class A007486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007486() {
    super(new long[] {1, 1, 1}, new long[] {1, 3, 4});
  }
}
