package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A069457 Lowest primes in twin packs.
 * @author Sean A. Irvine
 */
public class A069457 extends A001359 {

  private Z mT = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.THREE.equals(p)) {
        return Z.THREE;
      }
      if (p.compareTo(mT) < 0) {
        continue;
      }
      final Z q = mPrime.nextPrime(p.add(2));
      final Z r = mPrime.nextPrime(q);
      if (r.subtract(q).equals(Z.TWO)) {
        Z s = r;
        while (true) {
          final Z t = mPrime.nextPrime(s);
          s = mPrime.nextPrime(t);
          if (!s.subtract(t).equals(Z.TWO)) {
            mT = s;
            break;
          }
        }
        return p;
      }
    }
  }
}

