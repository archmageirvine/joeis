package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056573.
 * @author Sean A. Irvine
 */
public class A056573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056573() {
    super(new long[] {-1, 13, 104, -260, -260, 104, 13}, new long[] {0, 1, 1, 64, 729, 15625, 262144});
  }
}
