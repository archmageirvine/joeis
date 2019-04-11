package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236684 Values of c of triples <code>(a</code>,b,c) of positive integers such that <code>1/a +</code> 1/b + 1/c <code>= 1/2</code> and <code>a &lt;=</code> b <code>&lt;=</code> c. Listed with multiplicity, corresponding to solutions <code>(a</code>,b,c) listed in lexicographic order.
 * @author Georg Fischer
 */
public class A236684 extends FiniteSequence {

  /** Construct the sequence. */
  public A236684() {
    super(42, 24, 18, 15, 12, 20, 12, 8, 10, 6);
  }
}
