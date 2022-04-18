package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A157502 Even numbers without the squares.
 * @author Georg Fischer
 */
public class A157502 implements Sequence {

  private Z mN = Z.ZERO;
  private int mK = 2;
  private Z mK2 = Z.FOUR;

  @Override
  public Z next() {
    mN = mN.add(2);
    if (mN.equals(mK2)) {
      mN = mN.add(2);
      mK += 2;
      mK2 = Z.valueOf(mK).square();
    }
    return mN;
  }
}
