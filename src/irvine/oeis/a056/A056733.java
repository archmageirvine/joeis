package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056733 Each number is the sum of the cubes of its 3 sections.
 * @author Sean A. Irvine
 */
public class A056733 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 10;
  private long mM = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      if (++mM == mN) {
        mN *= 10;
      }
      final long ms = mM * mN * mN;
      final long m3 = mM * mM * mM;
      for (long a = 0; a <= mN; ++a) {
        final long as = ms + a * mN;
        final long a3 = a * a * a;
        for (long b = 0; b <= mN; ++b) {
          final long t = as + b;
          if (t == m3 + a3 + b * b * b) {
            mA.add(Z.valueOf(t));
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
