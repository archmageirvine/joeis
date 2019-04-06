package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085152 All prime factors of n and n+1 are &lt;= 5. (Related to the abc conjecture.)
 * @author Georg Fischer
 */
public class A085152 extends FiniteSequence {

  /** Construct the sequence. */
  public A085152() {
    super(1, 2, 3, 4, 5, 8, 9, 15, 24, 80);
  }
}
