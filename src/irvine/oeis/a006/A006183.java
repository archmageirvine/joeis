package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006183 a(n) = (n+1)*a(n-1) + (2-n)*a(n-2).
 * @author Sean A. Irvine
 */
public class A006183 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = mB.multiply(mN + 1).add(mA.multiply(2 - mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

