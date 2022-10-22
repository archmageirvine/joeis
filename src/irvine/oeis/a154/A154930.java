package irvine.oeis.a154;
// manually partrapl/partran at 2022-10-20 14:23

import irvine.math.z.Z;
import irvine.oeis.a007.A007317;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A154930 Inverse of Fibonacci convolution array A154929.
 * @author Georg Fischer
 */
public class A154930 extends PartitionTransformTriangle {

  private static class MySequence extends A007317 {

    private int mN = -1;

    @Override
    public Z next() {
      ++mN;
      return (mN & 1) == 0 ? super.next() : super.next().negate();
    }
  }

  /** Construct the sequence. */
  public A154930() {
    super(0, new MySequence());
  }
}
