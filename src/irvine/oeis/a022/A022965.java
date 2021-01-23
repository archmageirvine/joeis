package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022965 9-n.
 * @author Sean A. Irvine
 */
public class A022965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022965() {
    super(new long[] {-1, 2}, new long[] {9, 8});
  }
}
