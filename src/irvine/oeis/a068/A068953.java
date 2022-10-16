package irvine.oeis.a068;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068953 Number of bases B (2 &lt;= B &lt;= n) such that every digit of n in base B is 0 or 1.
 * @author Sean A. Irvine
 */
public class A068953 implements Sequence {

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
    ++mN;
    final HashSet<Z> considered = new HashSet<>();
    int cnt = 0;
    for (final Z b : Jaguar.factor(mN).divisors()) {
      considered.add(b);
      if (is01(mN, b.longValueExact())) {
        ++cnt;
      }
    }
    for (final Z b : Jaguar.factor(mN - 1).divisors()) {
      if (considered.add(b) && is01(mN, b.longValueExact())) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
