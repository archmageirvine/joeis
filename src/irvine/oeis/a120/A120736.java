package irvine.oeis.a120;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a048.A048751;

/**
 * A120736 Numbers k such that every prime p that divides d(k) (A000005) also divides k.
 * @author Georg Fischer
 */
public class A120736 extends PrependSequence {

  /** Construct the sequence. */
  public A120736() {
    super(1, new A048751(), 1, 2);
  }
}
