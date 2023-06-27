package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157879 Expansion of 120*x^2 / (-x^3+899*x^2-899*x+1).
 * @author Sean A. Irvine
 */
public class A157879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157879() {
    super(1, new long[] {1, -899, 899}, new long[] {0, 120, 107880});
  }
}
