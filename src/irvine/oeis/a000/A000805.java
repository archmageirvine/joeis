package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;

/**
 * A000805 Permanent of a certain cyclic n X <code>n (0,1)</code> matrix.
 * @author Sean A. Irvine
 */
public class A000805 extends PrependSequence {

  private static final int[] B = {2, 2, 1, 0, -4, -18, -16, -12, -10, -4, 4, 3, 2, 2, 1};
  private static final Z NINETY_SIX = Z.valueOf(96);

  /** Construct the sequence. */
  public A000805() {
    super(new Sequence() {
      private int mN = 0;

      private final Z[] mT = {
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
        Z.valueOf(9244418),
        Z.valueOf(24043990),
        Z.valueOf(62573616),
        Z.valueOf(162925614),
        Z.valueOf(424377730)
      };

      @Override
      public Z next() {
        if (mN < mT.length) {
          return mT[mN++];
        }
        Z t = NINETY_SIX;
        for (int k = 0; k < B.length; ++k) {
          t = t.add(mT[mT.length - 1 - k].multiply(B[k]));
        }
        System.arraycopy(mT, 1, mT, 0, 14);
        mT[14] = t;
        return t;
      }
    }, Z.ONE, Z.ONE, Z.TWO, Z.SIX, Z.valueOf(24));
  }
}

