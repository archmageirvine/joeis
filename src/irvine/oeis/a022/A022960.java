package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022960 a(n) = 4-n.
 * @author Sean A. Irvine
 */
public class A022960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022960() {
    super(new long[] {-1, 2}, new long[] {4, 3});
  }
}
