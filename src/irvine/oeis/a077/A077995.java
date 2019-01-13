package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077995.
 * @author Sean A. Irvine
 */
public class A077995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077995() {
    super(new long[] {1, 2, 2}, new long[] {1, 1, 4});
  }
}
