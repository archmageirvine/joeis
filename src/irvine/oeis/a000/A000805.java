package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000805 Permanent of a certain cyclic n X n (0,1) matrix.
 * @author Sean A. Irvine
 */
public class A000805 implements Sequence {

  private int mN = 0;

  private static final int[] B = {2, 2, 1, 0, -4, -18, -16, -12, -10, -4, 4, 3, 2, 2, 1};
  private static final Z NINETY_SIX = Z.valueOf(96);
  private final Z[] mT = {
    Z.ONE,
    Z.ONE,
    Z.TWO,
    Z.SIX,
    Z.valueOf(24),
    Z.valueOf(720),
    Z.valueOf(1854),
    Z.valueOf(4738),
    Z.valueOf(12072),
    Z.valueOf(30818),
    Z.valueOf(79118),
    Z.valueOf(204448),
    Z.valueOf(528950),
    Z.valueOf(1370674),
    Z.valueOf(3557408),
  };

  @Override
  public Z next() {
    if (mN < mT.length) {
      return mT[mN++];
    }
    Z t = NINETY_SIX;
    for (int k = 0; k < 15; ++k) {
      t = t.add(mT[14 - k].multiply(B[k]));
    }
    System.arraycopy(mT, 1, mT, 0, 14);
    mT[14] = t;
    return t;
  }
}

