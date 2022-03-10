package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055263 a(n) = Sum of digits of (n + a(n-1)).
 * @author Georg Fischer
 */
public class A055263 implements Sequence {

  private int mN = -1;
  private Z mA; // previous term

  @Override
  public Z next() {
    ++mN;
    mA = mN == 0 ? Z.ZERO : Z.valueOf(ZUtils.digitSum(mA.add(mN)));
    return mA;
  }
}
