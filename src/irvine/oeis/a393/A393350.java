package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a005.A005101;

/**
 * A393350 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A393350 extends A005101 {

  private final Fast mPrime = new Fast();
  private Z mA = super.next();

  @Override
  public Z next() {
    Z t = mA;
    mA = super.next();
    long cnt = 0;
    while ((t = mPrime.nextPrime(t)).compareTo(mA) < 0) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
