package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A393254 allocated for Fan Yu.
 * @author Sean A. Irvine
 */
public class A393254 extends A000142 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = super.next();
    Z p = f.add(1);
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.add(2).isProbablePrime()) {
        return p.subtract(f);
      }
    }
  }
}
