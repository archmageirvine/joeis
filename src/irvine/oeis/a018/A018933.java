package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;

/**
 * A018933 From the game of Mousetrap.
 * @author Sean A. Irvine
 */
public class A018933 extends PrependSequence {

  /** Construct the sequence. */
  public A018933() {
    super(new Sequence() {
            private Z mF = Z.ONE;
            private long mN = 6;

            @Override
            public Z next() {
              mF = mF.multiply(++mN - 5);
              return mF.multiply(Z.valueOf(mN).subtract(13).multiply(mN).add(59).multiply(mN).subtract(94));
            }
          },
      Z.TWO, Z.valueOf(11));
  }
}

