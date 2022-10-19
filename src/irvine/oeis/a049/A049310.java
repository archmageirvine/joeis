package irvine.oeis.a049;
// manually partran at 2022-10-03 08:24

import irvine.oeis.a056.A056594;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A049310 Triangle of coefficients of Chebyshev's S(n,x) := U(n,x/2) polynomials (exponents in increasing order).
 * @author Georg Fischer
 */
public class A049310 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A049310() {
    super(0, new A056594());
  }
}
