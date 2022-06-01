package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022961 5-n.
 * @author Sean A. Irvine
 */
public class A022961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022961() {
    super(new long[] {-1, 2}, new long[] {5, 4});
  }
}
