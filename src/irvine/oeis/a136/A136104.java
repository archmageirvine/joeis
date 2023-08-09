package irvine.oeis.a136;
// manually triprom/triprov at 2023-06-07 12:50

import irvine.oeis.a002.A002110;
import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.DotProduct;

/**
 * A136104 A007318 * A002110; a(n) = Sum_{k=0..n} binomial(n,k)*A002110(k).
 * @author Georg Fischer
 */
public class A136104 extends DotProduct {

  /** Construct the sequence. */
  public A136104() {
    super(0, new A007318(), new A002110());
  }
}
