package irvine.oeis.a100;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a053.A053795;

/**
 * A100490 Odd numbers ending in {1,3,7,9} that are not primes.
 * @author Georg Fischer
 */
public class A100490 extends PrependSequence {

  /** Construct the sequence. */
  public A100490() {
    super(new A053795(), 1);
  }
}
