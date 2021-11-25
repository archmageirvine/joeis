package irvine.oeis.a307;
// manually euleras at 2021-11-23 12:41

import irvine.oeis.EulerTransform;
import irvine.oeis.a050.A050369;

/**
 * A307604 G.f. A(x) satisfies: A(x) = (1/(1 - x)) * A(x^2)^2*A(x^3)^3*A(x^4)^4* ... *A(x^k)^k* ...
 * @author Georg Fischer
 */
public class A307604 extends EulerTransform {

  /** Construct the sequence. */
  public A307604() {
    super(new A050369(), 1);
  }
}
