package irvine.oeis.a056;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002730;

/**
 * A056424 Number of primitive (period n) step cyclic shifted sequences using exactly two different symbols.
 * @author Georg Fischer
 */
public class A056424 extends PrependSequence {

  /** Construct the sequence. */
  public A056424() {
    super(new A002730().skip(1), 0);
  }
}
