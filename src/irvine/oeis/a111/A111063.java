package irvine.oeis.a111;
// manually egfsi at 2021-12-01 19:29

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111063 a(0) = 1; a(n) = (n-1)*a(n-1) + n.
 * @author Georg Fischer
 */
public class A111063 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111063() {
    super(0, "[[0, 1],[-1, 1],[-1]]", "[1, 1]", 0);
  }
}
