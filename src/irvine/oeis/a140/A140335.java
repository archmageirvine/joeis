package irvine.oeis.a140;

import irvine.oeis.FiniteSequence;

/**
 * A140335 Smallest number greater than a(n-1) that, when adding the reciprocals of all the terms up to it, the sum is &lt;= 3.
 * @author Georg Fischer
 */
public class A140335 extends FiniteSequence {

  /** Construct the sequence. */
  public A140335() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 230, 57960);
  }
}
