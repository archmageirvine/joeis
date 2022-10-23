package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000246 Number of permutations in the symmetric group S_n that have odd order.
 * @author Sean A. Irvine
 */
public class A000246 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final Z t = mB.add(mA.multiply(mN - 1).multiply(mN - 2));
    mA = mB;
    mB = t;
    return t;
  }
}

