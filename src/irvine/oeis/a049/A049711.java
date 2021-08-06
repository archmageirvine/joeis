package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049711 a(n) = n - prevprime(n).
 * @author Sean A. Irvine
 */
public class A049711 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN - mPrime.prevPrime(mN));
  }
}
