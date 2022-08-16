package irvine.oeis.a192;
// manually 2021-11-04

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A192936 Constant term of the reduction by x^2 -&gt; x + 1 of the polynomial p(n,x) = Product_{k=1..n} (x+k).
 * Copied from A192239.
 * @author Georg Fischer
 */
public class A192936 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A192936() {
    super(0, "[[0],[-1, 3,-1],[-2, 2],[-1]]", "[1, 1, 3, 13]", -1);
  }
}
