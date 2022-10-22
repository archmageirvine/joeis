package irvine.oeis.a111;
// manually partrapl/partran at 2022-10-20 14:23

import irvine.math.z.Z;
import irvine.oeis.a157.A157674;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A111963 Inverse of renewal array for central trinomial numbers.
 * @author Georg Fischer
 */
public class A111963 extends PartitionTransformTriangle {

  private static class MySequence extends A157674 {

    private int mN = -1;

    {
      super.next();
    }

    @Override
    public Z next() {
      ++mN;
      return (mN & 1) == 0 ? super.next() : super.next().negate();
    }
  }

  /** Construct the sequence. */
  public A111963() {
    super(0, new MySequence());
  }
}
