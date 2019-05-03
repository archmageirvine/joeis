package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053613 Exceptional primes: there does not exist a consecutive triple of integers such that <code>a(n) (prime)</code> such that each number in the triple is a cubic residue of <code>a(n)</code>.
 * @author Georg Fischer
 */
public class A053613 extends FiniteSequence {

  /** Construct the sequence. */
  public A053613() {
    super(2, 3, 7, 13, 19, 31, 37, 43, 61, 67, 79, 127, 283);
  }
}
