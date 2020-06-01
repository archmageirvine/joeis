package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001685 <code>a(0) = 1, a(1) = 2, a(2) = 3;</code> for <code>n &gt;= 3, a(n) = a(n-2) + a(n-1)*Product_{i=1..n-3} a(i)</code>.
 * @author Sean A. Irvine
 */
public class A001685 implements Sequence {

  private long mN = -1;
  private Z mA = Z.TWO;
  private Z mB = Z.THREE;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.valueOf(mN + 1);
    }
    final Z t = mA.add(mB.multiply(mP));
    mP = mP.multiply(mA);
    mA = mB;
    mB = t;
    return mB;
  }
}
