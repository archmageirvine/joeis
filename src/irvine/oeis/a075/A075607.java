package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075607 a(1) = 1, a(n) = smallest number not occurring earlier such that the concatenation a(n-1) and a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A075607 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final String s = mA.toString();
    long k = 1;
    while (true) {
      k += 2;
      if (!mUsed.contains(k)) {
        final Z t = new Z(s + k);
        if (t.isProbablePrime()) {
          mUsed.add(k);
          mA = Z.valueOf(k);
          return mA;
        }
      }
    }
  }
}

