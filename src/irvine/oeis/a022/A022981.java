package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022981 25-n.
 * @author Sean A. Irvine
 */
public class A022981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022981() {
    super(new long[] {-1, 2}, new long[] {25, 24});
  }
}
