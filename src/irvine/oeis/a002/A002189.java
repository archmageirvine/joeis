package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import irvine.factor.prime.Fast;

/**
 * A002189 Pseudo-squares: a(n) = the least nonsquare positive integer which is 1 mod 8 and is a (nonzero) quadratic residue modulo the first n odd primes.
 * @author Sean A. Irvine
 */
public class A002189 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z s = Z.FOUR;
    while (true) {
      for (Z k = s.square().add(7).shiftRight(3).shiftLeft(3).add(1); k.compareTo(s.square().add(s.multiply2())) <= 0; k = k.add(8)) {
        boolean ok = true;
        for (Z p = Z.THREE; p.compareTo(mP) <= 0; p = mPrime.nextPrime(p)) {
          if (k.jacobi(p) < 1) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return k;
        }
      }
      s = s.add(1);
    }
  }
}
