package irvine.oeis.a326;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a171.A171503;

/**
 * A326354 a(n) is the number of fractions reduced to lowest terms with numerator and denominator less than or equal to n in absolute value.
 * @author Georg Fischer
 */
public class A326354 extends PrependSequence {

  /** Construct the sequence. */
  public A326354() {
    super(1, new A171503(), 1);
  }
}
