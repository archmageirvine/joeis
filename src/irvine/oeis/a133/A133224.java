package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133224 Let <code>P(A)</code> be the power set of an n-element set A and let B be the Cartesian product of <code>P(A)</code> with itself. Remove <code>(y,x)</code> from B when <code>(x,y)</code> is in B and x &lt;&gt; y and let <code>R35</code> denote the reduced set B. Then <code>a(n) =</code> the sum of the sizes of the union of x and y for every <code>(x,y)</code> in <code>R35</code>.
 * @author Sean A. Irvine
 */
public class A133224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133224() {
    super(new long[] {-64, 96, -52, 12}, new long[] {0, 2, 14, 78});
  }
}
