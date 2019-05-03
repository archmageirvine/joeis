package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226277 Numbers m of the form <code>u^v</code> where u and v are digits in decimal representation of m.
 * @author Georg Fischer
 */
public class A226277 extends FiniteSequence {

  /** Construct the sequence. */
  public A226277() {
    super(1, 25, 3125, 4096, 15625, 19683, 46656, 59049, 78125, 117649, 279936, 1953125, 4782969, 5764801, 10077696, 387420489L);
  }
}
