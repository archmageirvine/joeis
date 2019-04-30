package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073455 Numbers n such that to <code>phi(n) = pi(n)-1</code>.
 * @author Georg Fischer
 */
public class A073455 extends FiniteSequence {

  /** Construct the sequence. */
  public A073455() {
    super(6, 12, 18, 24, 42, 60);
  }
}
