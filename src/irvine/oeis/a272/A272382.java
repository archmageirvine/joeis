package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272382 Primes p <code>== 1 (mod 3)</code> for which A261029(14*p) <code>= 3</code>.
 * @author Georg Fischer
 */
public class A272382 extends FiniteSequence {

  /** Construct the sequence. */
  public A272382() {
    super(13, 19, 31, 37, 43, 61, 67, 97, 157);
  }
}
