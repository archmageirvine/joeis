package irvine.oeis.a321;
// manually partrapl/partran at 2022-10-20 14:23

import irvine.math.z.Z;
import irvine.oeis.a001.A001005;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A321198 Triangular Riordan matrix T = R^(-1) for triangular Riordan matrix R = (1/(1 + x^2 - x^3), x/(1 + x^2 - x^3)) given in A321196.
 * @author Georg Fischer
 */
public class A321198 extends PartitionTransformTriangle {

  private static class MySequence extends A001005 {

    private int mN = -1;

    @Override
    public Z next() {
      ++mN;
      return (mN & 1) == 0 ? super.next() : super.next().negate();
    }
  }

  /** Construct the sequence. */
  public A321198() {
    super(0, new MySequence());
  }
}
