package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055021 Smallest number k such that n iterations of sigma() are required for the result to be &gt;= 2k.
 * @author Georg Fischer
 */
public class A055021 extends FiniteSequence {

  /** Construct the sequence. */
  public A055021() {
    super(1, FINITE, 6, 2, 9, 81);
  }
}
