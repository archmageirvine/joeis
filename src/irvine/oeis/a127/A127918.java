package irvine.oeis.a127;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a117.A117762;

/**
 * A127918 Half of product of three numbers: n-th prime, previous and following number.
 * @author Georg Fischer
 */
public class A127918 extends PrependSequence {

  /** Construct the sequence. */
  public A127918() {
    super(1, new A117762().skip(1), 3);
  }
}
