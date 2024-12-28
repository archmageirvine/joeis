package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073927 Smallest n-th power &gt;1 such that every partial sum is a prime.
 * @author Sean A. Irvine
 */
public class A073927 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 1;
    while (true) {
      final Z m = Z.valueOf(++k).pow(mN);
      if (!mUsed.contains(m)) {
        final Z t = mSum.add(m);
        if (t.isProbablePrime()) {
          mSum = t;
          mUsed.add(m);
          return m;
        }
      }
    }
  }
}

