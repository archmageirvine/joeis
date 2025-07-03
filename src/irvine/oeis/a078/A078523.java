package irvine.oeis.a078;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078523 Primes of the form a^2 + b^6.
 * @author Sean A. Irvine
 */
public class A078523 extends Sequence1 {

  private final TreeSet<Z> mForms = new TreeSet<>();
  private long mA = 0;
  private Z mA2 = Z.ZERO;
  {
    mForms.add(Z.ONE);
  }

  @Override
  public Z next() {
    while (true) {
      while (mA2.compareTo(mForms.first()) <= 0) {
        mA2 = Z.valueOf(++mA).square();
        final Z a6 = mA2.pow(3);
        for (long k = 1; k <= mA; ++k) {
          final Z k2 = Z.valueOf(k).square();
          final Z k6 = k2.pow(3);
          mForms.add(mA2.add(k6));
          mForms.add(a6.add(k2));
        }
      }
      final Z p = mForms.pollFirst();
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
