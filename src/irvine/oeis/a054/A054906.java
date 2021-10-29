package irvine.oeis.a054;
// manually deris 1 A020483 at 2021-10-28 22:51

import irvine.oeis.PrependSequence;
import irvine.oeis.a020.A020483;

/**
 * A054906 Smallest number x such that sigma(x+2n) = sigma(x)+2n (first definition).
 *
 * @author Georg Fischer
 */
public class A054906 extends PrependSequence {

  /**
   * Construct the sequence.
   */
  public A054906() {
    super(0, new A020483());
    next();
  }
}
