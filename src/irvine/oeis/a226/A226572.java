package irvine.oeis.a226;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a202.A202321;

/**
 * A226572 Decimal expansion of lim_{k-&gt;oo} f(k), where f(1)=2, and f(k) = 2 + log(f(k-1)) for k&gt;1.
 * @author Georg Fischer
 */
public class A226572 extends PrependSequence {

  /** Construct the sequence. */
  public A226572() {
    super(1, new A202321().skip(1), 3);
  }
}
