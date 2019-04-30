package irvine.oeis.a039;

import irvine.oeis.FiniteSequence;

/**
 * A039785 Numbers n such that <code>phi(n)</code> is equal to the multiplicative projection of n.
 * @author Georg Fischer
 */
public class A039785 extends FiniteSequence {

  /** Construct the sequence. */
  public A039785() {
    super(9, 16, 50, 54, 100, 108, 144, 294, 450, 588, 900);
  }
}
