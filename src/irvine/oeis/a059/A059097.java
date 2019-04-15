package irvine.oeis.a059;

import irvine.oeis.FiniteSequence;

/**
 * A059097 Numbers n such that the binomial coefficient <code>C(2n,n)</code> is not divisible by the square of an odd prime.
 * @author Georg Fischer
 */
public class A059097 extends FiniteSequence {

  /** Construct the sequence. */
  public A059097() {
    super(0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 12, 21, 22, 28, 29, 30, 31, 36, 37, 54, 55, 57, 58, 110, 171, 784, 786);
  }
}
