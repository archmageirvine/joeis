package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067180 extends Sequence1 {

  // After Robert Israel

  private static final List<Z> EMPTY = Collections.emptyList();
  private long mN = 0;

  private List<Z> g(final long s, final long d) {
    if (s > 9 * d) {
      return EMPTY;
    }
    if (d == 1) {
      return Collections.singletonList(Z.valueOf(s));
    }
    final List<Z> res = new ArrayList<>();
    for (int j = 0; j <= 9; ++j) {
      for (final Z t : g(s - j, d - 1)) {
        res.add(Z.TEN.pow(d - 1).multiply(j).add(t));
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    if (mN < 10) {
      final Z n = Z.valueOf(mN);
      if (n.isProbablePrime()) {
        return n;
      }
    }
    if (mN % 3 == 0) {
      return Z.ZERO;
    }
    for (long d = (mN + 8) / 9; true; ++d) {
      if (d == 1 & mN < 10) {
        continue;
      }
      for (int j = 1; j <= 9; ++j) {
        for (final Z y : g(mN - j, d - 1)) {
          final Z x = Z.TEN.pow(d - 1).multiply(j).add(y);
          if (x.isProbablePrime()) {
            return x;
          }
        }
      }
    }
  }
}
