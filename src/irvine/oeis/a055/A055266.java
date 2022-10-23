package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055266 a(n) + a(n+1) is never prime; lexicographically earliest such sequence of distinct positive integers.
 * @author Sean A. Irvine
 */
public class A055266 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mPrev = null;

  @Override
  public Z next() {
    final Z t;
    if (mSeen.isEmpty()) {
      t = Z.ONE;
    } else {
      Z u = mPrev;
      while (true) {
        u = u.add(1);
        if (!mPrime.isPrime(u)) {
          final Z s = u.subtract(mPrev);
          if (!mSeen.contains(s)) {
            t = s;
            break;
          }
        }
      }
    }
    mSeen.add(t);
    mPrev = t;
    return t;
  }
}
