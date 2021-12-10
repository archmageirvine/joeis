package irvine.oeis.a053;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a050.A050981;

/**
 * A053452 Multiplicative order of 9 mod n, where gcd(n, 9) = 1.
 * @author Georg Fischer
 */
public class A053452 extends PrependSequence {

  /** Construct the sequence. */
  public A053452() {
    super(new A050981(), 1);
  }
}
