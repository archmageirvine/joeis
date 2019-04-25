package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055021 Smallest number k such that n iterations of <code>sigma()</code> are required for the result to be <code>&gt;= 2k</code>.
 * @author Georg Fischer
 */
public class A055021 extends FiniteSequence {

  /** Construct the sequence. */
  public A055021() {
    super(6, 2, 9, 81);
  }
}
