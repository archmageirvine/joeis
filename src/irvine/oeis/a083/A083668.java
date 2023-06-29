package irvine.oeis.a083;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001605;

/**
 * A083668 Prime indices of prime Fibonacci numbers.
 * @author Georg Fischer
 */
public class A083668 extends PrependSequence {

  /** Construct the sequence. */
  public A083668() {
    super(1, new A001605().skip(2), 3);
  }
}
