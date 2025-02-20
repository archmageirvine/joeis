package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075468 Minimal m such that n^n-m and n^n+m are both primes, or -1 if there is no such m.
 * @author Sean A. Irvine
 */
public class A075468 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).pow(mN);
    long k = 0;
    while (true) {
      if (t.subtract(++k).isProbablePrime() && t.add(k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
