package irvine.oeis.a336;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a122.A122111;

/**
 * A336119 Numbers k such that A122111(k) [the conjugated prime factorization of k] is a square or twice a square.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A336119 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A336119() {
    super(1, 1, new A122111(), v -> v.isSquare() || (v.isEven() && v.divide2().isSquare()));
  }
}
