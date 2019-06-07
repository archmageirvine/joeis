package irvine.oeis.a175;

import irvine.oeis.FiniteSequence;

/**
 * A175635 <code>a(n) =</code> smallest number m such that decimal expansion of <code>m^2</code> has exactly <code>(n+1)</code> digits <code>n</code>.
 * @author Georg Fischer
 */
public class A175635 extends FiniteSequence {

  /** Construct the sequence. */
  public A175635() {
    super(0, 11, 149, 1156, 2538, 22925, 163284, 2116076, 9321378, 31622764);
  }
}
