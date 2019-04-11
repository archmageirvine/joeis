package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134045 Let P(A) be the power set of <code>an</code> n-element set A. Then <code>a(n) =</code> the number of pairs of elements <code>{x</code>,y} of P(A) for which either <code>0) x</code> and y are disjoint and for which either x is a subset of y or y is a subset of <code>x,</code> or <code>1) x</code> and y are intersecting but for which x is not a subset of y and y is not a subset of <code>x,</code> or <code>2) x =</code> y.
 * @author Sean A. Irvine
 */
public class A134045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134045() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 3, 7, 18});
  }
}
