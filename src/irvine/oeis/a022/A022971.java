package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022971 15-n.
 * @author Sean A. Irvine
 */
public class A022971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022971() {
    super(new long[] {-1, 2}, new long[] {15, 14});
  }
}
