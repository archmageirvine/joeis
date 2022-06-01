package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134168 Let P(A) be the power set of an n-element set A. Then a(n) = the number of pairs of elements {x,y} of P(A) for which either 0) x and y are disjoint and for which either x is a subset of y or y is a subset of x, or 1) x and y are intersecting but for which x is not a subset of y and y is not a subset of x, or 2) x and y are intersecting and for which either x is a proper subset of y or y is a proper subset of x, or 3) x = y.
 * @author Sean A. Irvine
 */
public class A134168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134168() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 3, 9, 30});
  }
}
