package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060925.
 * @author Sean A. Irvine
 */
public class A060925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060925() {
    super(new long[] {3, 2}, new long[] {1, 4});
  }
}
