package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185669.
 * @author Sean A. Irvine
 */
public class A185669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185669() {
    super(new long[] {1, -3, 3}, new long[] {2, 9, 24});
  }
}
