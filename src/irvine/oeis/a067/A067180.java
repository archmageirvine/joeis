package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A067180 Smallest prime with digit sum n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A067180 extends Sequence1 implements DirectSequence {

  // After Robert Israel

  private static final List<Z> EMPTY = Collections.emptyList();
  private long mN = 0;

  static List<Z> g(final long s, final long d) {
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

  private Z a(final long n) {
    if (n == 1) {
      return Z.ZERO;
    }
    if (n < 10) {
      final Z zn = Z.valueOf(n);
      if (zn.isProbablePrime()) {
        return zn;
      }
    }
    if (n % 3 == 0) {
      return Z.ZERO;
    }
    for (long d = (n + 8) / 9; true; ++d) {
      if (d == 1 & n < 10) {
        continue;
      }
      for (int j = 1; j <= 9; ++j) {
        for (final Z y : g(n - j, d - 1)) {
          final Z x = Z.TEN.pow(d - 1).multiply(j).add(y);
          if (x.isProbablePrime()) {
            return x;
          }
        }
      }
    }
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final int n) {
    return a((long) n);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
