package irvine.oeis.a168;

import irvine.oeis.FiniteSequence;

/**
 * A168162 Numbers n which do not exceed the sum of the binary digits in all primes <code>&lt;= n</code>.
 * @author Georg Fischer
 */
public class A168162 extends FiniteSequence {

  /** Construct the sequence. */
  public A168162() {
    super(3, 5, 7, 8, 11, 13, 14, 19, 23, 31, 32, 47, 61);
  }
}
