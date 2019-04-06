package irvine.oeis.a143;

import irvine.oeis.FiniteSequence;

/**
 * A143867 a(n) = number of n-digit integers in which the first k digits are divisible by k-th prime. Leading zeros are not allowed.
 * @author Georg Fischer
 */
public class A143867 extends FiniteSequence {

  /** Construct the sequence. */
  public A143867() {
    super(4, 13, 26, 44, 39, 33, 24, 11, 4, 2);
  }
}
