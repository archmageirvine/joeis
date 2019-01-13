package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185505.
 * @author Sean A. Irvine
 */
public class A185505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185505() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 51, 156, 375});
  }
}
