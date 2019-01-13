package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022628.
 * @author Sean A. Irvine
 */
public class A022628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022628() {
    super(new long[] {-440, 623, -207, 25}, new long[] {1, 25, 418, 5898});
  }
}
