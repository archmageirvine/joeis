package irvine.oeis.a060;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A060085 a(n) gives least prime for which the n-th prime is the least prime which is not a primitive root of a(n) (see A060084), or 0 if the n-th prime never occurs in A060084.
 * @author Sean A. Irvine
 */
public class A060085 extends A060084 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (!mA.containsKey(mP)) {
      mQ = mPrime.nextPrime(mQ);
      final Z q = super.next();
      if (!mA.containsKey(q)) {
        mA.put(q, mQ);
      }
    }
    return mA.get(mP);
  }
}
