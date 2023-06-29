package irvine.oeis.a159;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a046.A046930;

/**
 * A159461 Numbers of previous and following composites of n-th prime.
 * @author Georg Fischer
 */
public class A159461 extends PrependSequence {

  /** Construct the sequence. */
  public A159461() {
    super(1, new A046930().skip(1), 0);
  }
}
