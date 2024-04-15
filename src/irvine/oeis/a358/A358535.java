package irvine.oeis.a358;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A358535 a(1) = 1; let S(n) = Sum_{j=1..n-1} a(j) and let T(n) = Sum_{j=1..n-1} d(a(j)) where d(n) = A000005(n). a(n) = least novel k such that (T(n)+d(k)) | (S(n)+k).
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
        final Z d = mSumD.add(Functions.SIGMA0.z(k));
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
