package irvine.oeis.a002;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002217 Starting with n, repeatedly calculate the sum of prime factors (with repetition) of the previous term, until reaching 0 or a fixed point: a(n) is the number of terms in the resulting sequence.
 * @author Sean A. Irvine
 */
public class A002217 implements Sequence {

  private long mN = 0;
  private final HashMap<Long, Long> mCache = new HashMap<>();

  private long sumPrimes(final long n) {
    final Long v = mCache.get(n);
    if (v != null) {
      return v;
    }
    final FactorSequence fs = Jaguar.factor(n);
    long s = 0;
    for (final Z z : fs.toZArray()) {
      s += z.longValue() * fs.getExponent(z);
    }
    mCache.put(n, s);
    return s;
  }

  @Override
  public Z next() {
    long c = 0;
    long n = ++mN;
    if (n == 1) {
      return Z.TWO;
    }
    while (true) {
      final long m = n;
      n = sumPrimes(n);
      ++c;
      if (m == n) {
        break;
      }
    }
    return Z.valueOf(c);
  }
}
