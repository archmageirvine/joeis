package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014887 n is equal to the number of 1's in all numbers &lt;= n written in base 7.
 * @author Sean A. Irvine
 */
public class A014887 extends FiniteSequence {

  /** Construct the sequence. */
  public A014887() {
    super(1, FINITE, 1, 3930, 6044, 61879, 137256);
  }
}
