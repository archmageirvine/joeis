package irvine.oeis.a162;
// manually deris/essent at 2022-10-25 23:17

import irvine.oeis.PrependSequence;
import irvine.oeis.a094.A094524;

/**
 * A162337 Primes p such that floor(p/3) is prime.
 * @author Georg Fischer
 */
public class A162337 extends PrependSequence {

  /** Construct the sequence. */
  public A162337() {
    super(0, new A094524(), 7);
  }
}
