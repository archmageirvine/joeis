package irvine.oeis.a299;

import irvine.oeis.FiniteSequence;

/**
 * A299791 2-provable primes: Primes p expressible as <code>x+y,</code> where the prime factors of x and y are precisely the primes less than sqrt(p).
 * @author Georg Fischer
 */
public class A299791 extends FiniteSequence {

  /** Construct the sequence. */
  public A299791() {
    super(5, 11, 13, 17, 19, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 167);
  }
}
