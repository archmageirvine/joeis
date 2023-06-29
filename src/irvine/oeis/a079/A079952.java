package irvine.oeis.a079;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a055.A055930;

/**
 * A079952 Number of primes less than prime(n)/2.
 * @author Georg Fischer
 */
public class A079952 extends PrependSequence {

  /** Construct the sequence. */
  public A079952() {
    super(1, new A055930().skip(2), 0, 0);
  }
}
