package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108486.
 * @author Sean A. Irvine
 */
public class A108486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108486() {
    super(new long[] {-36, 24, 8, 4}, new long[] {1, 2, 10, 80});
  }
}
