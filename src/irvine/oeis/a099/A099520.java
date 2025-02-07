package irvine.oeis.a099;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099520 a(1)=1; for n&gt;1, a(n)=smallest integer m&gt;0 not yet appearing in sequence such that m+a(n-1) is a multiple of n-1.
 * @author Sean A. Irvine
 */
public class A099520 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z k = mA.divide(mN - 1).multiply(mN - 1);
      Z t = k.subtract(mA);
      while (true) {
        t = t.add(mN - 1);
        if (mUsed.add(t)) {
          mA = t;
          return t;
        }
      }
    }
    mUsed.add(mA);
    return mA;
  }
}

