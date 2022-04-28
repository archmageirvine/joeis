package irvine.oeis.a253;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052409;

/**
 * A253641 future sequence
 * @author Georg Fischer
 */
public class A253641 extends PrependSequence {

  /** Construct the sequence. */
  public A253641() {
    super(1, new A052409(), 1, 1);
  }
}
