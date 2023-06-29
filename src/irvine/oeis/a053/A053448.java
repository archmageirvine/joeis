package irvine.oeis.a053;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a050.A050977;

/**
 * A053448 Multiplicative order of 5 mod m, where gcd(m, 5) = 1.
 * @author Georg Fischer
 */
public class A053448 extends PrependSequence {

  /** Construct the sequence. */
  public A053448() {
    super(1, new A050977(), 1);
  }
}
