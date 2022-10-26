package irvine.oeis.a185;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a002.A002313;

/**
 * A185952 Partial products of A002313, the primes that are 1 or 2 (mod 4).
 * @author Georg Fischer
 */
public class A185952 extends PartialProductSequence {

  /** Construct the sequence. */
  public A185952() {
    super(new A002313());
  }
}
