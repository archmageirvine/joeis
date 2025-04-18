package irvine.oeis.a076;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076654 Smallest natural number not a multiple of 10, not occurring earlier and starting with the end of the previous term.
 * @author Sean A. Irvine
 */
public class A076654 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;
  {
    mUsed.add(Z.ZERO);
  }

  @Override
  public Z next() {
    Z r = mA.mod(Z.TEN);
    if (!mUsed.contains(r)) {
      mA = r;
      mUsed.add(mA);
      return mA;
    }
    long lim = 1;
    while (true) {
      r = r.multiply(10);
      lim *= 10;
      for (long d = 1; d < lim; ++d) {
        if (d % 10 != 0) {
          final Z t = r.add(d);
          if (!mUsed.contains(t)) {
            mA = t;
            mUsed.add(mA);
            return mA;
          }
        }
      }
    }
  }
}
