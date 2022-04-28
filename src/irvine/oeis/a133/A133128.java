package irvine.oeis.a133;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a141.A141620;

/**
 * A133128 Triangle of first differences of A120070 with a leftmost column of A002522.
 * @author Georg Fischer
 */
public class A133128 extends PrependSequence {

  /** Construct the sequence. */
  public A133128() {
    super(new A141620(), 2);
  }
}
