package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A003478 Expansion of <code>1/(1-2x)(1-x-2x^3 )</code>.
 * @author Sean A. Irvine
 */
public class A003478 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A003478() {
    super(RING.one(), Polynomial.create(1, -3, 2, -2, 4));
  }
}

