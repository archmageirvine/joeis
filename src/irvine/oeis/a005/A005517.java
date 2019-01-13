package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005517.
 * @author Sean A. Irvine
 */
public class A005517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005517() {
    super(new long[] {0, 0, 5, 0, 0}, new long[] {1, 2, 3, 5, 9});
  }
}
