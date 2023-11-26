package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A066923 Let f(x) = phi(x) + sigma(x); a(n) = least k such that at k begins a maximal run of length n of consecutive strict local extrema of f, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A066923 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  private Z f(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.phi().add(fs.sigma());
  }

  private int isLocalExtrema(final long n) {
    final Z a = n < 2 ? Z.ZERO : f(n - 1);
    final Z b = f(n);
    final Z c = f(n + 1);
    if (a.compareTo(b) < 0 && b.compareTo(c) > 0) {
      return 1;
    }
    if (a.compareTo(b) > 0 && b.compareTo(c) < 0) {
      return -1;
    }
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    long s;
    while (mFirsts.get(mN) == 0) {
      int a = isLocalExtrema(++mM);
      if (a != 0) {
        int c = 1;
        s = mM;
        int b;
        while ((b = isLocalExtrema(++mM)) == -a) {
          a = b;
          ++c;
        }
        if (mFirsts.get(c) == 0) {
          mFirsts.set(c, s);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
