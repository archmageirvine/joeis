package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108020 Numbers n whose binary representation is 1100, n times.
 * @author Sean A. Irvine
 */
public class A108020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108020() {
    super(new long[] {-16, 17}, new long[] {0, 12});
  }
}
