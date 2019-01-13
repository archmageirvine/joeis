package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174339.
 * @author Sean A. Irvine
 */
public class A174339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174339() {
    super(new long[] {1, -3, 3}, new long[] {0, 109, 436});
  }
}
