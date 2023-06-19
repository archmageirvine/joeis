package irvine.oeis.a320;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038063;

/**
 * A320783 Inverse Euler transform of (-1)^(n - 1).
 * @author Georg Fischer
 */
public class A320783 extends PrependSequence {

  /** Construct the sequence. */
  public A320783() {
    super(new A038063().skip(3), 1, 1, -2, 2);
  }
}
