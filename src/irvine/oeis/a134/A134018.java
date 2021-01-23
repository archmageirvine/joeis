package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134018 Let P(A) be the power set of an n-element set A. Then a(n) = the number of pairs of elements {x,y} of P(A) for which either 0) x and y are disjoint and for which either x is a subset of y or y is a subset of x, or 1) x and y are intersecting but for which x is not a subset of y and y is not a subset of x.
 * @author Sean A. Irvine
 */
public class A134018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134018() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 1, 3, 10});
  }
}
