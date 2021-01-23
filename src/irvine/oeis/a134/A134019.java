package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134019 Let P(A) be the power set of an n-element set A. Then a(n) = the number of pairs of elements {x,y} of P(A) for which either 0) x and y are intersecting but for which x is not a subset of y and y is not a subset of x, or 1) x = y.
 * @author Sean A. Irvine
 */
public class A134019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134019() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 2, 4, 11});
  }
}
