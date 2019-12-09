package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113163 <code>a(n) = binomial(5, n) * binomial(7, 5-n)</code>.
 * @author Georg Fischer
 */
public class A113163 extends FiniteSequence {

  /** Construct the sequence. */
  public A113163() {
    super(21, 175, 350, 210, 35, 1);
  }
}
