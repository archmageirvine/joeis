package irvine.oeis.a076;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076652 Smallest composite number not divisible by 10, not occurring earlier and starting with the end of the previous term.
 * @author Sean A. Irvine
 */
public class A076652 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;
  {
    mUsed.add(Z.ZERO);
    mUsed.add(Z.ONE);
  }

  @Override
  public Z next() {
    Z r = mA.mod(Z.TEN);
    if (!mUsed.contains(r) && !r.isProbablePrime()) {
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
          if (!mUsed.contains(t) && !t.isProbablePrime()) {
            mA = t;
            mUsed.add(mA);
            return mA;
          }
        }
      }
    }
  }
}
