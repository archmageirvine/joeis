package irvine.oeis.a162;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a058.A058296;

/**
 * A162801 Bisection of A162800.
 * @author Georg Fischer
 */
public class A162801 extends PrependSequence {

  /** Construct the sequence. */
  public A162801() {
    super(1, new A058296().skip(1), 0);
  }
}
