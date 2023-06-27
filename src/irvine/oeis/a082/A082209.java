package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082209 a(1) = 1, a(n) = smallest number such that the concatenation of a(n-1) and a(n) is a square.
 * @author Sean A. Irvine
 */
public class A082209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082209() {
    super(1, new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 6, 4, 9, 61, 504});
  }
}
