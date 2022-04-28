package irvine.oeis.a187;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a045.A045749;

/**
 * A187570 Rank transform of the sequence ceiling(n/3); complement of A187571.
 * @author Georg Fischer
 */
public class A187570 extends PrependSequence {

  /** Construct the sequence. */
  public A187570() {
    super(1, new A045749());
  }
}
