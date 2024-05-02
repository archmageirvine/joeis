package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A069467 Twin primes belonging to packs of three or more twin pairs.
 * @author Sean A. Irvine
 */
public class A069467 extends A069457 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      Z p = super.next();
      mA.add(p);
      if (Z.THREE.equals(p)) {
        p = Z.FIVE;
        mA.add(Z.FIVE);
      }
      p = mPrime.nextPrime(p);
      mA.add(p);
      while (true) {
        final Z q = mPrime.nextPrime(p);
        p = mPrime.nextPrime(q);
        if (!p.subtract(q).equals(Z.TWO)) {
          break;
        }
        mA.add(q);
        mA.add(p);
      }
      if (mA.size() < 6) {
        mA.clear();
      }
    }
    return mA.pollFirst();
  }
}

