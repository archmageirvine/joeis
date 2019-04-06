package irvine.oeis.a032;

import irvine.oeis.FiniteSequence;

/**
 * A032529 All the primes inside the record 3 X 3 matrix for the Gordon Lee problem: this is [ 113, 754, 937 ].
 * @author Georg Fischer
 */
public class A032529 extends FiniteSequence {

  /** Construct the sequence. */
  public A032529() {
    super(3, 5, 7, 11, 13, 17, 31, 37, 41, 43, 47, 53, 59, 71, 73, 79, 97, 113, 157, 179, 311, 347, 359, 457, 739, 743, 751, 937, 953, 971);
  }
}
