package irvine.oeis.a259;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a059.A059662;

/**
 * A259630 a(n) is the smallest integer not occurring earlier such that 2^a(1) + 2^a(2) + ... + 2^a(n) is a prime.
 * @author Georg Fischer
 */
public class A259630 extends PrependSequence {

  /** Construct the sequence. */
  public A259630() {
    super(1, new A059662().skip(0), 1);
  }
}
