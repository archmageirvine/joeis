package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022980 a(n) = 24-n.
 * @author Sean A. Irvine
 */
public class A022980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022980() {
    super(new long[] {-1, 2}, new long[] {24, 23});
  }
}
