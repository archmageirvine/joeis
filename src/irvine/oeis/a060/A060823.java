package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060823 4-wave sequence beginning with 2's with middles dropped.
 * @author Sean A. Irvine
 */
public class A060823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060823() {
    super(new long[] {-1, -1, 3, 2}, new long[] {2, 2, 8, 20});
  }
}
