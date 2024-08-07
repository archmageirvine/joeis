package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022967 a(n) = 11-n.
 * @author Sean A. Irvine
 */
public class A022967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022967() {
    super(new long[] {-1, 2}, new long[] {11, 10});
  }
}
