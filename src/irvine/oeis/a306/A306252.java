package irvine.oeis.a306;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A306252 Least primitive root mod A033948(n).
 * @author Sean A. Irvine
 */
public class A306252 extends Sequence1 {

  protected long mN = 0;

  protected Z select(final long n, final long c) {
    return Z.valueOf(c);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return select(1, 0);
      }
      final List<Long> un = new ArrayList<>();
      for (long u = 1; u < mN; ++u) {
        if (Functions.GCD.l(mN, u) == 1) {
          un.add(u);
        }
      }
      final int order = un.size();
      for (final long cand : un) {
        boolean isGen = true;
        long run = 1;
        for (int k = 0; k < order - 1; ++k) {
          run *= cand;
          run %= mN;
          if (run == 1) {
            isGen = false;
            break;
          }
        }
        if (isGen) {
          return select(mN, cand);
        }
      }
    }
  }
}
