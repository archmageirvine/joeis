package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188135.
 * @author Sean A. Irvine
 */
public class A188135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188135() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 37});
  }
}
