package irvine.oeis.a283;

import irvine.oeis.FiniteSequence;

/**
 * A283792 Primes of the form <code>(p^2 + q^2) / 2</code> such that <code>(p^2 - q^2) / 24</code> is prime, where primes p <code>&gt; q &gt; 3</code>.
 * @author Georg Fischer
 */
public class A283792 extends FiniteSequence {

  /** Construct the sequence. */
  public A283792() {
    super(109, 157, 229);
  }
}
