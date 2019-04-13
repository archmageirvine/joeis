package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A001920 Expansion of <code>1/(1+759*x^2+2576*x^3+759*x^4+x^6)</code>.
 * @author Sean A. Irvine
 */
public class A001920 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001920() {
    super(RING.one(), Polynomial.create(1, 0, 759, 2576, 759, 0, 1));
  }
}
