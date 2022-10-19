package irvine.oeis.a202;
// manually partran at 2022-10-18 05:00

import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001006;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A202710 Triangle T(n,k) = coefficient of x^n in the Taylor expansion of [((1-x-2*x^2-sqrt(1-2*x-3*x^2))/(2*x^2))]^k.
 * @author Georg Fischer
 */
public class A202710 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A202710() {
    super(1, new SkipSequence(new A001006(), 1));
  }
}
