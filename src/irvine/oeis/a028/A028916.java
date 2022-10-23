package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028916 Friedlander-Iwaniec primes: Primes of form a^2 + b^4.
 * @author Sean A. Irvine
 */
public class A028916 extends Sequence1 {

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
        final Z a4 = mA2.square();
        for (long k = 1; k <= mA; ++k) {
          final Z k2 = Z.valueOf(k).square();
          final Z k4 = k2.square();
          mForms.add(mA2.add(k4));
          mForms.add(a4.add(k2));
        }
      }
      final Z p = mForms.pollFirst();
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
