package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076714 Smallest k such that k^n + n^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A076714 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).pow(mN).add(1);
    long k = 0;
    while (true) {
      if (t.add(Z.valueOf(++k).pow(mN)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
