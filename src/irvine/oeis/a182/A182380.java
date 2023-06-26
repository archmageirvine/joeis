package irvine.oeis.a182;
// manually 2021-08-08

import irvine.oeis.NoncomputableSequence;

/**
 * A182380 Primes whose base 26 representation (using a=1, b=2, ..., y=25, z=0) form English words or phrases.
 * @author Georg Fischer
 */
public class A182380 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A182380() {
    super(1, NONCOMPUTABLE, 31, 53, 61, 67, 109, 149, 157, 197, 223, 313, 347, 353, 359, 379,
    409, 421, 503, 509, 521, 613, 691, 743, 859, 863, 929, 1049, 1097, 1163,
    1181, 1201, 1249, 1487, 1489, 1601, 2281, 2437, 2441, 2521, 2579, 2741, 2753);
  }
}
