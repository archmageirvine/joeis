package irvine.oeis.a220;

import irvine.oeis.FiniteSequence;

/**
 * A220480 The number of n-digit numbers where last k digits are divisible by the k-th prime for k <code>= 1..n</code>.
 * @author Georg Fischer
 */
public class A220480 extends FiniteSequence {

  /** Construct the sequence. */
  public A220480() {
    super(5, 15, 36, 52, 48, 34, 18, 11, 5);
  }
}
