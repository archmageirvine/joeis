package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078770 a(n) = the least positive integer k such that k^2 + k + 2*n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A078770 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long k = 0;
    while (true) {
      final Z t = Z.valueOf(++k).square().add(k).add(mN);
      if (t.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

