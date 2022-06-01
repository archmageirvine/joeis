package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133224 Let P(A) be the power set of an n-element set A and let B be the Cartesian product of P(A) with itself. Remove (y,x) from B when (x,y) is in B and x &lt;&gt; y and let R35 denote the reduced set B.  Then a(n) = the sum of the sizes of the union of x and y for every (x,y) in R35.
 * @author Sean A. Irvine
 */
public class A133224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133224() {
    super(new long[] {-64, 96, -52, 12}, new long[] {0, 2, 14, 78});
  }
}
