package irvine.oeis.a053;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a050.A050979;

/**
 * A053450 Multiplicative order of 7 mod n, where gcd(n,7) = 1.
 * @author Georg Fischer
 */
public class A053450 extends PrependSequence {

  /** Construct the sequence. */
  public A053450() {
    super(1, new A050979(), 1);
  }
}
