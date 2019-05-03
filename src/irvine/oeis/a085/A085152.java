package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085152 All prime factors of n and <code>n+1</code> are <code>&lt;= 5</code>. (Related to the abc <code>conjecture.)</code>.
 * @author Georg Fischer
 */
public class A085152 extends FiniteSequence {

  /** Construct the sequence. */
  public A085152() {
    super(1, 2, 3, 4, 5, 8, 9, 15, 24, 80);
  }
}
