package irvine.oeis.a102;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005097;

/**
 * A102781 Number of positive even numbers less than the n-th prime.
 * @author Georg Fischer
 */
public class A102781 extends PrependSequence {

  /** Construct the sequence. */
  public A102781() {
    super(new A005097(), 0);
  }
}
