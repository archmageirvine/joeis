package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055265 a(n) is the smallest positive integer not already in the sequence such that a(n)+a(n-1) is prime, starting with a(1)=1.
 * @author Sean A. Irvine
 */
public class A055265 implements Sequence {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mPrev = null;

  @Override
  public Z next() {
    final Z t;
    if (mSeen.isEmpty()) {
      t = Z.ONE;
    } else {
      Z p = mPrev;
      while (true) {
        p = mPrime.nextPrime(p);
        Z s = p.subtract(mPrev);
        if (!mSeen.contains(s)) {
          t = s;
          break;
        }
      }
    }
    mSeen.add(t);
    mPrev = t;
    return t;
  }
}
