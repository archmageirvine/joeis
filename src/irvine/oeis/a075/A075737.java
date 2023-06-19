package irvine.oeis.a075;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005478;

/**
 * A075737 Prime Fibonacci numbers with prime indices.
 * @author Georg Fischer
 */
public class A075737 extends PrependSequence {

  /** Construct the sequence. */
  public A075737() {
    super(new A005478().skip(2), 2);
  }
}
