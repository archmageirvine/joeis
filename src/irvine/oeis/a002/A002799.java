package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.Sequence;

/**
 * A002799 Number of 4-line partitions of n (i.e., planar partitions of n with at most 4 lines).
 * @author Sean A. Irvine
 */
public class A002799 extends EulerTransformSequence {

  private static class InnerSequence implements Sequence {
    private long mN = 0;
    @Override
    public Z next() {
      return ++mN < 4 ? Z.valueOf(mN) : Z.FOUR;
    }
  }

  /** Construct the sequence. */
  public A002799() {
    super(new InnerSequence(), 0);
  }
}
