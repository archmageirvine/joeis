package irvine.oeis.a089;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a053.A053778;

/**
 * A089628 Smallest member of a pair of consecutive twin prime pairs that have no primes between them.
 * @author Georg Fischer
 */
public class A089628 extends PrependSequence {

  /** Construct the sequence. */
  public A089628() {
    super(3, new A053778().skip(1), 3, 5);
  }
}
