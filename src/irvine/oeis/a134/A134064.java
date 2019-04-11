package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134064 Let P(A) be the power set of an n-element set A. Then <code>a(n) =</code> the number of pairs of elements <code>{x</code>,y} of P(A) for which either <code>0) x</code> and y are intersecting but for which x is not a subset of y and y is not a subset of <code>x,</code> or <code>1) x</code> and y are intersecting and for which either x is a proper subset of y or y is a proper subset of <code>x,</code> or <code>2) x =</code> y.
 * @author Sean A. Irvine
 */
public class A134064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134064() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 2, 6, 23});
  }
}
