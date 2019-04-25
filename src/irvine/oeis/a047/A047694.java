package irvine.oeis.a047;

import irvine.oeis.FiniteSequence;

/**
 * A047694 x such that <code>y^2 = C(x,0) + C(x,1) + C(x,2) + C(x,3)</code> is soluble.
 * @author Georg Fischer
 */
public class A047694 extends FiniteSequence {

  /** Construct the sequence. */
  public A047694() {
    super(-1, 0, 2, 7, 15, 74, 767);
  }
}
