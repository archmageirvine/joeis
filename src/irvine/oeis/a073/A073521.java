package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073521 The set of 16 consecutive primes with the property that they form a <code>4 X 4</code> magic square with the smallest magic constant <code>(258)</code>.
 * @author Georg Fischer
 */
public class A073521 extends FiniteSequence {

  /** Construct the sequence. */
  public A073521() {
    super(31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101);
  }
}
