package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279100 a(n) = Sum_{k=0..n} ceiling(phi^k), where phi is the golden ratio (A001622).
 * @author Sean A. Irvine
 */
public class A279100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279100() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {1, 3, 6, 11, 18});
  }
}
