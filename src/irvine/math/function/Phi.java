package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Compute the Euler totient function.
 * For small values it will consult a table,
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
public class Phi extends AbstractFunction1 {

  private static final long MAX_REMEMBER = 1L << 24;
  private final LongDynamicLongArray mPhi = new LongDynamicLongArray();
  {
    mPhi.set(0, 1L); // Convention
    mPhi.set(1, 1L); // Convention
  }

  @Override
  public long l(final long n) {
    if (n <= 0) {
      if (n == 0) {
        return 0;
      }
      return l(-n);
    }
    if (n >= MAX_REMEMBER) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).phi().longValueExact();
    }
    final long phi = mPhi.get(n);
    if (phi != 0) {
      return phi;
    }
    final long t = Jaguar.factor(n).phi().longValueExact();
    mPhi.set(n, t);
    return t;
  }

  @Override
  public Z z(final Z n) {
    return n.bitLength() < Long.SIZE ? Z.valueOf(l(n.longValue())) : Jaguar.factor(n.abs()).phi();
  }
}
