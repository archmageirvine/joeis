package irvine.oeis.a168;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a059.A059841;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A168561 Triangle of coefficients of the Fibonacci polynomials, starting with F(0, x) = 1, F(1, x) = x.
 * @author Georg Fischer
 */
public class A168561 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A168561() {
    super(0, new A059841());
  }
}
