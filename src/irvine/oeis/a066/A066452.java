package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;

/**
 * A066452 Anti-phi(n).
 * @author Sean A. Irvine
 */
public class A066452 extends Sequence2 implements DirectSequence {

  // After Michel Marcus

  private int mN = 1;

  static List<Long> antidivisors(final long n) {
    final List<Long> res = new ArrayList<>();
    for (long k = 2; k < n; ++k) {
      if (Math.abs(2 * (n % k) - k) < 2) {
        res.add(k);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final long n) {
    final List<Long> ad = antidivisors(n);
    long cnt = 0;
    for (long j = 1; j < n; ++j) {
      long isAd = 1;
      for (final long a : ad) {
        if (j % a == 0) {
          isAd = 0;
          break;
        }
      }
      cnt += isAd;
    }
    return Z.valueOf(cnt);
  }

}
