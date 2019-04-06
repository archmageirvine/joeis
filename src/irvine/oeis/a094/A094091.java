package irvine.oeis.a094;

import irvine.oeis.FiniteSequence;

/**
 * A094091 a(1) = 0; for n&gt;0, a(n) = smaller of 0 and 1 such that we avoid the property that, for some i and j in the range S = 2 &lt;= i &lt; j &lt;= n/2, a(i) ... a(2i) is a subsequence of a(j) ... a(2j).
 * @author Georg Fischer
 */
public class A094091 extends FiniteSequence {

  /** Construct the sequence. */
  public A094091() {
    super(0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0);
  }
}
