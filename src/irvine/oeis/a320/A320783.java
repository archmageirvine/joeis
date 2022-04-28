package irvine.oeis.a320;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038063;

/**
 * A320783 future sequence
 * @author Georg Fischer
 */
public class A320783 extends PrependSequence {

  /** Construct the sequence. */
  public A320783() {
    super(3, new A038063(), 1, 1, -2, 2);
  }
}
