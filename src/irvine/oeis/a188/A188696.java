package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188696.
 * @author Sean A. Irvine
 */
public class A188696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188696() {
    super(new long[] {-2, 26, -1, 26}, new long[] {1, 26, 676, 17576});
  }
}
