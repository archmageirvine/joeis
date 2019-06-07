package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084167 <code>A002313</code> is the list of primes p having a unique representation as the sum of two squares, p <code>= x^2 + y^2</code>. If n is in the present sequence (and in <code>A002313)</code>, the count of primitive roots of n which are in sequence <code>A002313</code> too is <code>x</code>. The count of those primitive roots is <code>A084168</code>.
 * @author Georg Fischer
 */
public class A084167 extends FiniteSequence {

  /** Construct the sequence. */
  public A084167() {
    super(1, 5, 17, 109, 157, 317, 389, 449, 709, 1201, 1237, 1249, 1429, 1621, 1801, 2341, 3001);
  }
}
