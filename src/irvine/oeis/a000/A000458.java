package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000458 <code>a(0) = a(1) = 1;</code> thereafter <code>a(n) = sigma(a(n-1)) + sigma(a(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A000458 implements Sequence {

  private Z mA = null;
  private Z mASigma = Z.ONE;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z s = Cheetah.factor(mB).sigma();
      final Z t = mASigma.add(s);
      mA = mB;
      mB = t;
      mASigma = s;
    }
    return mB;
  }
}
