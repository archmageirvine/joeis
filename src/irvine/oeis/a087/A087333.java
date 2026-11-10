package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087331 Smallest number with all identical digits having n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A087333 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z best = null;
    long s = 0;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0; k < mN; ++k) {
        sb.append(2 * (s + k) - 1);
      }
      final Z t0 = new Z(sb);
      if (best != null && t0.compareTo(best) > 0) {
        return best;
      }
      if (t0.isProbablePrime()) {
        if (best == null || t0.compareTo(best) < 0) {
          best = t0;
        }
      } else {
        Z t = t0;
        long lim = 1;
        while (true) {
          t = t.multiply(10);
          lim *= 10;
          if (best != null && t.compareTo(best) > 0) {
            break;
          }
          for (long add = 1; add < lim; add += 2) {
            final Z ta = t.add(add);
            if ((best == null || ta.compareTo(best) < 0) && ta.isProbablePrime()) {
              best = ta;
              break;
            }
          }
        }
      }
    }
  }
}
