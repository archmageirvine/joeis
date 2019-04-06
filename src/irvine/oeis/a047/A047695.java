package irvine.oeis.a047;

import irvine.oeis.FiniteSequence;

/**
 * A047695 y such that y^2 = C(x,0) + C(x,1) + C(x,2) + C(x,3) is soluble.
 * @author Georg Fischer
 */
public class A047695 extends FiniteSequence {

  /** Construct the sequence. */
  public A047695() {
    super(0, 1, 2, 8, 24, 260, 8672);
  }
}
