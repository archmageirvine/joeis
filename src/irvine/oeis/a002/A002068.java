package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002068 Wilson remainders: <code>a(n) =</code> ((p-1)!+1)/p mod p, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A002068 implements Sequence {

  private long mP = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z p = Z.valueOf(mP);
    final Z p2 = p.square();
    Z x = Z.ONE;
    for (long k = 2; k < mP; ++k) {
      x = x.modMultiply(k, p2);
    }
    x = x.add(1).divide(mP);
    return x.mod(p);
  }
}

