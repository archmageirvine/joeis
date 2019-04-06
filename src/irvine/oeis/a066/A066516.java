package irvine.oeis.a066;

import irvine.oeis.FiniteSequence;

/**
 * A066516 Numbers n such that g(sigma(n)) = phi(n), where g(n) = prime(n+1) - prime(n).
 * @author Georg Fischer
 */
public class A066516 extends FiniteSequence {

  /** Construct the sequence. */
  public A066516() {
    super(1, 4, 5, 15, 18, 30, 36);
  }
}
