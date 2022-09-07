package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058954 p is prime; x&gt;=0; n = p*2^x; m is 0 or 1; n such that tau(n)-m = A058933(n), where tau(n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A058954 extends A058933 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
