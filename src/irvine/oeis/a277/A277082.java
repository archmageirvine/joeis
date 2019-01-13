package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277082.
 * @author Sean A. Irvine
 */
public class A277082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277082() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 12, 15, 37});
  }
}
