package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084167 Numbers k in A002313 such that the count of primitive roots of k (A084168) are also in sequence A002313, where A002313 is the list of primes p having a unique representation as the sum of two squares, p = x^2 + y^2.
 * @author Georg Fischer
 */
public class A084167 extends FiniteSequence {

  /** Construct the sequence. */
  public A084167() {
    super(1, FINITE, 1, 5, 17, 109, 157, 317, 389, 449, 709, 1201, 1237, 1249, 1429, 1621, 1801, 2341, 3001);
  }
}
