package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A000750 Expansion of bracket function.
 * @author Sean A. Irvine
 */
public class A000750 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A000750() {
    super(RING.one(), Polynomial.create(1, 5, 10, 10, 5));
  }
}
