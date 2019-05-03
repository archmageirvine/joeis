package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236682 Values of a for triples <code>(a,b,c)</code> of positive integers such that <code>1/a + 1/b + 1/c = 1/2</code> and a <code>&lt;= b &lt;=</code> c, listed with multiplicity.
 * @author Georg Fischer
 */
public class A236682 extends FiniteSequence {

  /** Construct the sequence. */
  public A236682() {
    super(3, 3, 3, 3, 3, 4, 4, 4, 5, 6);
  }
}
