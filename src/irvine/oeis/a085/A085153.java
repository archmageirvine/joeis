package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085153 All prime factors of n and <code>n+1</code> are <code>&lt;= 7</code>. (Related to the abc <code>conjecture.)</code>.
 * @author Georg Fischer
 */
public class A085153 extends FiniteSequence {

  /** Construct the sequence. */
  public A085153() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 15, 20, 24, 27, 35, 48, 49, 63, 80, 125, 224, 2400, 4374);
  }
}
