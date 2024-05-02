package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A069458 Twin pack primes.
 * @author Sean A. Irvine
 */
public class A069458 extends A069457 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
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
    }
    return mA.pollFirst();
  }
}

