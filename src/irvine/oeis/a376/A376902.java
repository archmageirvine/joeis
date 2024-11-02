package irvine.oeis.a376;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A376902 Numbers k such that the concatenation of their prime factors with multiplicity, in some order, yields the k-th prime number.
 * @author Sean A. Irvine
 */
public class A376902 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private boolean search(final String s, final Map<String, MutableInteger> map) {
    if (s.isEmpty()) {
      return true;
    }
    for (int k = 0; k < s.length(); ++k) {
      final MutableInteger m = map.get(s.substring(k));
      if (m != null && m.get() > 0) {
        m.postDecrement();
        if (search(s.substring(0, k), map)) {
          return true;
        }
        m.postIncrement();
      }
    }
    return false;
  }

  private boolean is(final Z p, final long n) {
    // First do a quick check that the digits are compatible
    final FactorSequence fs = Jaguar.factor(n);
    final int[] cnts = ZUtils.digitCounts(p);
    for (Z q : fs.toZArray()) {
      final int e = fs.getExponent(q);
      do {
        final Z[] qr = q.divideAndRemainder(10);
        final int r = qr[1].intValue();
        cnts[r] -= e;
        if (cnts[r] < 0) {
          return false;
        }
        q = qr[0];
      } while (!q.isZero());
    }
    if (!IntegerUtils.isZero(cnts)) {
      return false;
    }
    // Ok possible match, try harder
    final Map<String, MutableInteger> factors = new HashMap<>();
    for (final Z q : fs.toZArray()) {
      factors.put(q.toString(), new MutableInteger(fs.getExponent(q)));
    }
    return search(p.toString(), factors);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(super.next(), ++mN)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
