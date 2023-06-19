package irvine.oeis.a097;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001132;

/**
 * A097958 Primes p such that p divides 6^((p-1)/2) - 3^((p-1)/2).
 * @author Georg Fischer
 */
public class A097958 extends PrependSequence {

  /** Construct the sequence. */
  public A097958() {
    super(new A001132().skip(0), 3);
  }
}
