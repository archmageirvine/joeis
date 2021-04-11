package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046495 Primes expressible as the sum of 3 consecutive palindromes.
 * @author Sean A. Irvine
 */
public class A046495 extends A002113 {

  {
    super.next(); // skip 0
  }

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      final Z s = t.add(mA).add(mB);
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
