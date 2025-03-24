package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * The unique square free integer dividing a number.
 * For small values it will consult a table,
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
public class Core extends AbstractFunction1 {

  private static final long MAX_REMEMBER = 1L << 12;
  private final LongDynamicLongArray mCore = new LongDynamicLongArray();

  @Override
  public long l(final long n) {
    if (n < 2) {
      return 1;
    }
    if (n >= MAX_REMEMBER) {
      // Request value is larger than the table, use factorization
      return Jaguar.factor(n).core().longValueExact();
    }
    final long phi = mCore.get(n);
    if (phi != 0) {
      return phi;
    }
    final long t = Jaguar.factor(n).core().longValueExact();
    mCore.set(n, t);
    return t;
  }

  @Override
  public Z z(final Z n) {
    return n.bitLength() < Long.SIZE ? Z.valueOf(l(n.longValue())) : Jaguar.factor(n).core();
  }
}
