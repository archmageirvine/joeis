package irvine.oeis.a065;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a055.A055388;

/**
 * A065457 Period of the flip-riffle shuffle function on a deck of 2n cards.
 * @author Georg Fischer
 */
public class A065457 extends PrependSequence {

  /** Construct the sequence. */
  public A065457() {
    super(0, new A055388());
  }
}
