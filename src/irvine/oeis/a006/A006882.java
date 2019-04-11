package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006882 Double factorials <code>n!!</code>: <code>a(n) = n*a(n-2)</code> for <code>n &gt; 1, a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A006882 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
