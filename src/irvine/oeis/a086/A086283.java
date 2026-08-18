package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086283 a(1)=1, a(2)=1 and, for n&gt;2, a(n) is the smallest positive integer such that the sequence of second order absolute difference is the sequence of positive integers {1,2,3,4,...}.
 * @author Sean A. Irvine
 */
public class A086283 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    final Z d = mA.subtract(mB).abs();
    final Z u = d.add(mN);
    Z t = mB.compareTo(u) > 0 ? mB.subtract(u) : mB.add(u);
    final Z v = d.subtract(mN);
    if (v.signum() >= 0) {
      t = t.min(mB.compareTo(v) > 0 ? mB.subtract(v) : mB.add(v));
    }
    mA = mB;
    mB = t;
    return t;
  }
}
