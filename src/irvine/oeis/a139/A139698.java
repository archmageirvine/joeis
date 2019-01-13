package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139698.
 * @author Sean A. Irvine
 */
public class A139698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139698() {
    super(new long[] {-2, 3}, new long[] {1, 26});
  }
}
