package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077763.
 * @author Sean A. Irvine
 */
public class A384706 extends Sequence1 {

  private long mN = 13;

  private boolean is(final long n) {
    final Z sn = Functions.SIGMA.z(n);
    final Z t = sn.multiply(n);
    for (long k = 1; k < n; ++k) {
      final Z sk = Functions.SIGMA.z(k);
      if (t.add(sk.multiply(k)).equals(sn.multiply(sk))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

