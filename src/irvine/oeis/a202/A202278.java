package irvine.oeis.a202;

import irvine.oeis.FiniteSequence;

/**
 * A202278 Right-truncatable Fibonacci numbers: every prefix is Fibonacci number.
 * @author Georg Fischer
 */
public class A202278 extends FiniteSequence {

  /** Construct the sequence. */
  public A202278() {
    super(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
  }
}
