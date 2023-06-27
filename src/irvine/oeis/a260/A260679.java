package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260679 a(n) = n+(17-n)^2.
 * @author Sean A. Irvine
 */
public class A260679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260679() {
    super(1, new long[] {1, -3, 3}, new long[] {257, 227, 199});
  }
}
