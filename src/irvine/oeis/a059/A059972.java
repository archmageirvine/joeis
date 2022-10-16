package irvine.oeis.a059;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059972 a(n) is the least positive integer k such that all digits of k are 0 or 1 in exactly n different bases B, where 2 &lt;= B &lt;= k; i.e., such that A068953(k)=n.
 * @author Sean A. Irvine
 */
public class A059972 implements Sequence {

  private int mN = 0;

  private boolean is01(long m, final long base) {
    if (base < 2) {
      return false;
    }
    while (m != 0) {
      if (m % base > 1) {
        return false;
      }
      m /= base;
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    final HashSet<Z> considered = new HashSet<>();
    long m = 1;
    while (true) {
      ++m;
      considered.clear();
      int cnt = 0;
      for (final Z b : Jaguar.factor(m).divisors()) {
        considered.add(b);
        if (is01(m, b.longValueExact()) && ++cnt > mN) {
          break;
        }
      }
      for (final Z b : Jaguar.factor(m - 1).divisors()) {
        if (considered.add(b) && is01(m, b.longValueExact()) && ++cnt > mN) {
          break;
        }
      }
      if (cnt == mN) {
        return Z.valueOf(m);
      }
    }
  }
}
