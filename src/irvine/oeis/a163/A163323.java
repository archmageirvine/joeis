package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163323.
 * @author Sean A. Irvine
 */
public class A163323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163323() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12, -20, 76, 876, 3340});
  }
}
