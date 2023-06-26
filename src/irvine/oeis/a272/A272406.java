package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272406 Primes p == 1 (mod 3) for which A261029(34*p) = 2.
 * @author Georg Fischer
 */
public class A272406 extends FiniteSequence {

  /** Construct the sequence. */
  public A272406() {
    super(1, FINITE, 7, 13, 19, 31, 37, 43, 61, 67, 73, 79, 97, 103, 109, 127, 139, 151, 157, 163, 181, 193, 199, 211, 223, 229, 241, 271, 277, 283, 307, 313, 331, 337, 367, 373, 397, 409, 421, 439, 457, 487, 571, 709, 787, 877);
  }
}
