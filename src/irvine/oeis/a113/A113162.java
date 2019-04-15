package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113162 <code>a(n) = binomial(6, n) * binomial(7, 6-n)</code>.
 * @author Georg Fischer
 */
public class A113162 extends FiniteSequence {

  /** Construct the sequence. */
  public A113162() {
    super(7, 126, 525, 700, 315, 42, 1);
  }
}
