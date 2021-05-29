package irvine.oeis.a343;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A343471.
 * @author Sean A. Irvine
 */
public class A343471 implements Sequence {

  private int mN = 0;
  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }

  private boolean isPrimeChain(Z t, final int n) {
    if (!t.isProbablePrime()) {
      return false;
    }
    for (int k = 1; k < n; ++k) {
      t = mPrime.nextPrime(t);
      final int[] cnts = ZUtils.digitCounts(t);
      if (cnts[0] > 0 || cnts[1] > 0 || cnts[4] > 0 || cnts[6] > 0 || cnts[8] > 0 || cnts[9] > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z t = mA.pollFirst();
      final Z u = t.multiply(10);
      mA.add(u.add(2));
      mA.add(u.add(3));
      mA.add(u.add(5));
      mA.add(u.add(7));
      if (isPrimeChain(t, mN)) {
        mA.add(t); // re-add t because it can be the answer for more than one mN
        return t;
      }
    }
  }
}
