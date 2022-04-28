package irvine.oeis.a102;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000179;

/**
 * A102761 Same as A000179, except that a(0) = 2.
 * @author Georg Fischer
 */
public class A102761 extends PrependSequence {

  /** Construct the sequence. */
  public A102761() {
    super(1, new A000179(), 2);
  }
}
