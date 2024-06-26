package irvine.oeis.a347;
// Generated by gen_seq4.pl 2024-05-09/insect2 at 2024-05-09 22:36

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005385;
import irvine.oeis.a097.A097443;

/**
 * A347226 Safe primes (A005385) that are half-period primes (A097443).
 * @author Georg Fischer
 */
public class A347226 extends IntersectionSequence {

  /** Construct the sequence. */
  public A347226() {
    super(new A005385(), new A097443());
  }
}
