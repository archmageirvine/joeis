package irvine.oeis.a187;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a045.A045750;

/**
 * A187571 Complement of A187570.
 * @author Georg Fischer
 */
public class A187571 extends PrependSequence {

  /** Construct the sequence. */
  public A187571() {
    super(1, new A045750());
  }
}
