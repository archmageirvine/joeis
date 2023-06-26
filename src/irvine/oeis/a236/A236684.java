package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236684 Values of c of triples (a,b,c) of positive integers such that 1/a + 1/b + 1/c = 1/2 and a &lt;= b &lt;= c. Listed with multiplicity, corresponding to solutions (a,b,c) listed in lexicographic order.
 * @author Georg Fischer
 */
public class A236684 extends FiniteSequence {

  /** Construct the sequence. */
  public A236684() {
    super(1, FINITE, 42, 24, 18, 15, 12, 20, 12, 8, 10, 6);
  }
}
