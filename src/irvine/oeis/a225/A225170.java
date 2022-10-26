package irvine.oeis.a225;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005172;

/**
 * A225170 Number of non-degenerate fanout-free Boolean functions of n variables having AND rank 1.
 * @author Georg Fischer
 */
public class A225170 extends PrependSequence {

  /** Construct the sequence. */
  public A225170() {
    super(1, new A005172(), 2);
  }
}
