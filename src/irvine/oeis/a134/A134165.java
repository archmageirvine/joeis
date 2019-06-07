package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134165 Let <code>P(A)</code> be the power set of an n-element set A. Then <code>a(n) =</code> the number of pairs of elements <code>{x,y}</code> of <code>P(A)</code> for which either <code>0) x</code> and y are disjoint and for which either x is a subset of y or y is a subset of x, or <code>1) x</code> and y are disjoint and for which x is not a subset of y and y is not a subset of x, or <code>2) x</code> and y are intersecting but for which x is not a subset of y and y is not a subset of x, or <code>3) x = y</code>.
 * @author Sean A. Irvine
 */
public class A134165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134165() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 3, 8, 24});
  }
}
