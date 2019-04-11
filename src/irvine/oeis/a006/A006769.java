package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006769 Elliptic divisibility sequence associated with elliptic curve "37a1": y^2 + y <code>= x^3 - x</code> and multiples of the point <code>(0,0)</code>.
 * @author Sean A. Irvine
 */
public class A006769 implements Sequence {

  private final Z[] mA = {Z.ZERO, Z.ONE, Z.ONE, Z.NEG_ONE, Z.ONE};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[(int) mN];
    }
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[4] = mA[3].multiply(mA[1]).add(mA[2].square()).divide(mA[0]);
    return mA[4];
  }
}

