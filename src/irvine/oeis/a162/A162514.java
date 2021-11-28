package irvine.oeis.a162;

import irvine.oeis.a114.A114525;
import irvine.oeis.triangle.Transpose;

/**
 * A162514 Triangle of coefficients of polynomials defined by the Binet form P(n,x) = U^n + L^n, where U = (x + d)/2, L = (x - d)/2, d = (4 + x^2)^(1/2). Decreasing powers of x.
 * @author Georg Fischer
 */
public class A162514 extends Transpose {

  /** Construct the sequence. */
  public A162514() {
    super(new A114525());
  }
}
