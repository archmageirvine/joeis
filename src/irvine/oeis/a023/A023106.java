package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023106 <code>a(n)</code> is a power of the sum of its digits.
 * @author Sean A. Irvine
 */
public class A023106 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(Z.TEN) < 0) {
        return mN;
      }
      final long s = ZUtils.digitSum(mN);
      if (s > 1 && mN.mod(s) == 0 && mN.equals(Z.valueOf(s).pow((int) Math.round(mN.log(s))))) {
        return mN;
      }
    }
  }
}
