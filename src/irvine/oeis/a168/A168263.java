package irvine.oeis.a168;

import irvine.oeis.FiniteSequence;

/**
 * A168263 For any m <code>&lt;</code> n, and for all values of k, <code>d(n^k) &gt; d(m^k)</code>. (Let k, m, and n represent positive integers <code>only.)</code>.
 * @author Georg Fischer
 */
public class A168263 extends FiniteSequence {

  /** Construct the sequence. */
  public A168263() {
    super(1, 2, 4, 6, 12, 24, 60, 120, 180, 840, 1260, 1680, 27720);
  }
}
