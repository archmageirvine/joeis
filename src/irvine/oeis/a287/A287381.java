package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287381.
 * @author Sean A. Irvine
 */
public class A287381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287381() {
    super(new long[] {-1, 2, 1}, new long[] {2, 4, 7});
  }
}
