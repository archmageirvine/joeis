package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251770 Numbers n such that <code>n^2 + (n+1)^2 + (n+2)^2</code> is equal to the sum of the heptagonal numbers <code>H(m), H(m+1)</code> and <code>H(m+2)</code> for some m.
 * @author Sean A. Irvine
 */
public class A251770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251770() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {27, 378, 40365, 546516, 58207743});
  }
}
