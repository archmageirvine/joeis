package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A010065 <code>a(n+1) = a(n) +</code> sum of digits in base 4 representation of <code>a(n)</code>, with <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A010065 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSum(mA, Z.FOUR));
    return mA;
  }
}

