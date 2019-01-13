package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271723.
 * @author Sean A. Irvine
 */
public class A271723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271723() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {3, 4, 8, 11, 19});
  }
}
