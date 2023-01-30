package irvine.oeis.a358;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A358535 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A358535 extends Sequence1 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private Z mSum = Z.ONE;
  private Z mSumD = Z.ONE;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(1L);
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      if (!mSeen.contains(++k)) {
        final Z d = mSumD.add(Jaguar.factor(k).sigma0());
        final Z s = mSum.add(k);
        if (s.mod(d).isZero()) {
          mSum = s;
          mSumD = d;
          mSeen.add(k);
          return Z.valueOf(k);
        }
      }
    }
  }
}
