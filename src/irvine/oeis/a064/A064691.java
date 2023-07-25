package irvine.oeis.a064;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064691 a(n) is the smallest number not already used such that a(n)*a(n-1)*a(n-2) + 1 is a square, with a(1)=1 and a(2)=2.
 * @author Sean A. Irvine
 */
public class A064691 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        mSeen.add(Z.ONE);
        return Z.ONE;
      }
      mB = Z.TWO;
      mSeen.add(Z.TWO);
      return Z.TWO;
    }
    final Z b = mA.multiply(mB);
    Z k = Z.THREE;
    while (mSeen.contains(k) || !b.multiply(k).add(1).isSquare()) {
      k = k.add(1);
    }
    mSeen.add(k);
    mA = mB;
    mB = k;
    return k;
  }
}
