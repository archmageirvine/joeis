package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022959 3-n.
 * @author Sean A. Irvine
 */
public class A022959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022959() {
    super(new long[] {-1, 2}, new long[] {3, 2});
  }
}
