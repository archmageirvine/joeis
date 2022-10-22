package irvine.oeis.a190;
// manually partrapl/partran at 2022-10-20 14:23

import irvine.oeis.a071.A071359;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A190252 Riordan matrix (g(x),x*g(x)), where g(x) = (1-x-sqrt(1-2*x-3*x^2-4*x^3))/(2*x^2*(1+x)).
 * @author Georg Fischer
 */
public class A190252 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A190252() {
    super(0, new A071359(), 1);
  }
}
