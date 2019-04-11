package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236683 Values of b of triples <code>(a,b</code>,c) of positive integers such that <code>1/a + 1/b +</code> 1/c <code>= 1/2</code> and <code>a &lt;= b &lt;=</code> c. Listed with multiplicity, corresponding to solutions <code>(a,b</code>,c) listed in lexicographic order.
 * @author Georg Fischer
 */
public class A236683 extends FiniteSequence {

  /** Construct the sequence. */
  public A236683() {
    super(7, 8, 9, 10, 12, 5, 6, 8, 5, 6);
  }
}
