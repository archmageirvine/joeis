package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084172.
 * @author Sean A. Irvine
 */
public class A084172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084172() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 2, 4, 9});
  }
}
