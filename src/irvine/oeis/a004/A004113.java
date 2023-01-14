package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A004113 Number of rooted trees with n nodes and 2-colored non-leaf nodes.
 * @author Sean A. Irvine
 */
public class A004113 implements Sequence {

  private Z mA = Z.ONE;

  private class A004133Inner implements Sequence {
    @Override
    public Z next() {
      return mA;
    }
  }

  private int mN = 0;
  private final A004133Inner mSeq = new A004133Inner();
  private final Sequence mEulerTransform = new EulerTransform(mSeq);

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    }
    mA = mEulerTransform.next().multiply2();
    return mA;
  }
}
