package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236683 Values of b of triples (a,b,c) of positive integers such that 1/a + 1/b + 1/c = 1/2 and a &lt;= b &lt;= c. Listed with multiplicity, corresponding to solutions (a,b,c) listed in lexicographic order.
 * @author Georg Fischer
 */
public class A236683 extends FiniteSequence {

  /** Construct the sequence. */
  public A236683() {
    super(7, 8, 9, 10, 12, 5, 6, 8, 5, 6);
  }
}
