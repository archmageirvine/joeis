package irvine.oeis.a046;

import irvine.oeis.DistinctMultiplicativeClosureSequence;
import irvine.oeis.a000.A000668;

/**
 * A046528 Numbers that are a product of distinct Mersenne primes (elements of A000668).
 * @author Sean A. Irvine
 */
public class A046528 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A046528() {
    super(new A000668());
  }
}
