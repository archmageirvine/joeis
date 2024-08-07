package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022992 a(n) = 36-n.
 * @author Sean A. Irvine
 */
public class A022992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022992() {
    super(new long[] {-1, 2}, new long[] {36, 35});
  }
}
