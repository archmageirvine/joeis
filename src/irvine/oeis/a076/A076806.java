package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076806 Minimal odd k such that k*2^n-1 and k*2^n+1 are twin primes.
 * @author Sean A. Irvine
 */
public class A076806 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    final Z u = mA.multiply2();
    long k = -1;
    Z t = mA.negate();
    while (true) {
      k += 2;
      t = t.add(u);
      if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

