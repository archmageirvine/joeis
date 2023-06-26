package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073522 A set of 25 consecutive primes that form a 5 X 5 magic square with the (non-minimal) magic constant 1703.
 * @author Georg Fischer
 */
public class A073522 extends FiniteSequence {

  /** Construct the sequence. */
  public A073522() {
    super(1, FINITE, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419);
  }
}
