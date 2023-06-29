package irvine.oeis.a092;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a013.A013597;

/**
 * A092131 Distance from 2^n to the next prime.
 * @author Georg Fischer
 */
public class A092131 extends PrependSequence {

  /** Construct the sequence. */
  public A092131() {
    super(1, new A013597().skip(2), 0);
  }
}
