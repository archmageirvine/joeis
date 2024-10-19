package irvine.oeis.a072;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072651.
 * @author Sean A. Irvine
 */
public class A072652 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 3;

  private boolean gcdExp(final FactorSequence fs) {
    int gcd = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      gcd = gcd == 0 ? e : Functions.GCD.i(gcd, e);
      if (gcd == 1) {
        return false;
      }
    }
    return true;
  }

  private int isPower(final long n, final long d) {
    if (d == 1) {
      return 0;
    }
    int k = 1;
    long m = d;
    do {
      ++k;
      m *= d;
    } while (m < n);
    return m == n ? k : 0;
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (gcdExp(fs)) {
        int cnt = 0;
        for (final Z d : fs.divisors()) {
          final int k = isPower(mN, d.longValueExact());
          if (k != 0 && isPower(mN, k) != 0) {
            ++cnt;
          }
        }
        if (cnt > 0) {
          final Z n = Z.valueOf(mN);
          for (int k = 0; k < cnt; ++k) {
            mA.add(n);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
