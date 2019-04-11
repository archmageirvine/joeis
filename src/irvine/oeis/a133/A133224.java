package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133224 Let P(A) be the power set of an n-element set A and let B be the Cartesian product of P(A) with itself. Remove (y,x) from B when <code>(x</code>,y) is in B and <code>x &lt;&gt;</code> y and let R35 denote the reduced set B. Then <code>a(n) =</code> the sum of the sizes of the union of x and y for every <code>(x</code>,y) in R35.
 * @author Sean A. Irvine
 */
public class A133224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133224() {
    super(new long[] {-64, 96, -52, 12}, new long[] {0, 2, 14, 78});
  }
}
