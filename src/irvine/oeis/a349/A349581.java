package irvine.oeis.a349;
// manually deris/binomx at 2022-10-26 11:22

import irvine.oeis.a002.A002293;
import irvine.oeis.transform.BinomialTransform;

/**
 * A349581 G.f. A(x) satisfies: A(x) = 1 / (1 - 2*x) + x * (1 - 2*x)^2 * A(x)^4.
 * @author Georg Fischer
 */
public class A349581 extends BinomialTransform {

  /** Construct the sequence. */
  public A349581() {
    super(new BinomialTransform(new A002293()));
  }
}
