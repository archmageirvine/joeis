package irvine.oeis.a359;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359035 a(n+1) is the smallest number not already used which can be written as the product of two numbers with the same difference as a(n) and a(n-1); a(1)=1 and a(2)=2.
 * @author Sean A. Irvine
 */
public class A359035 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mSeen.add(Z.ONE);
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      mSeen.add(Z.TWO);
      return Z.TWO;
    }
    final Z d = mB.subtract(mA).abs();
    Z t = Z.ZERO;
    while (true) {
      t = t.add(1);
      final Z k = t.multiply(t.add(d));
      if (!mSeen.contains(k)) {
        mA = mB;
        mB = k;
        mSeen.add(k);
        return k;
      }
    }
  }
}
