package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272384 Primes p <code>== 1 (mod 3)</code> for which <code>A261029(22*p) = 2</code>.
 * @author Georg Fischer
 */
public class A272384 extends FiniteSequence {

  /** Construct the sequence. */
  public A272384() {
    super(7, 13, 19, 31, 37, 43, 61, 67, 73, 79, 97, 103, 109, 127, 139, 151, 181, 211, 229, 307, 313, 421);
  }
}
