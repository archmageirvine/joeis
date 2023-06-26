package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236682 Values of a for triples (a,b,c) of positive integers such that 1/a + 1/b + 1/c = 1/2 and a &lt;= b &lt;= c, listed with multiplicity.
 * @author Georg Fischer
 */
public class A236682 extends FiniteSequence {

  /** Construct the sequence. */
  public A236682() {
    super(1, FINITE, 3, 3, 3, 3, 3, 4, 4, 4, 5, 6);
  }
}
