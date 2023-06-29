package irvine.oeis.a111;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006530;

/**
 * A111089 Largest prime factor of 2n.
 * @author Georg Fischer
 */
public class A111089 extends PrependSequence {

  /** Construct the sequence. */
  public A111089() {
    super(1, new A006530().skip(1), 2);
  }
}
