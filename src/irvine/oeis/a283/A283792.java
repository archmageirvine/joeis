package irvine.oeis.a283;

import irvine.oeis.FiniteSequence;

/**
 * A283792 Primes of the form (p^2 + q^2) <code>/ 2</code> such that (p^2 - q^2) <code>/ 24</code> is prime, where primes p &gt; q <code>&gt; 3</code>.
 * @author Georg Fischer
 */
public class A283792 extends FiniteSequence {

  /** Construct the sequence. */
  public A283792() {
    super(109, 157, 229);
  }
}
