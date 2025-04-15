package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076719 Smallest k such that k^n - n^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A076719 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.subtract(Z.valueOf(++mN).pow(mN));
    long k = mN;
    while (true) {
      if (t.add(Z.valueOf(++k).pow(mN)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
