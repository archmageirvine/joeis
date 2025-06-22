package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078201 Smallest prime of the form n^k + k^n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A078201 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(mN);
      final Z u = t.add(Z.valueOf(++m).pow(mN));
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}

