package irvine.oeis.a053;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a050.A050978;

/**
 * A053449 Multiplicative order of 6 mod n, where gcd(n, 6) = 1.
 * @author Georg Fischer
 */
public class A053449 extends PrependSequence {

  /** Construct the sequence. */
  public A053449() {
    super(new A050978(), 1);
  }
}
