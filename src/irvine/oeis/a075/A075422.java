package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075422 Primitive numbers n such that the product of factorials of all proper divisors of n does not divide n!.
 * @author Sean A. Irvine
 */
public class A075422 extends Sequence1 {

  private final List<Long> mPrimitive = new ArrayList<>();
  private long mN = 23;

  private boolean isPrimitive(final long n) {
    for (final long v : mPrimitive) {
      if (n % v == 0) {
        return false;
      }
    }
    return true;
  }

  private boolean is(final long n) {
    Z f = Functions.FACTORIAL.z(n);
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d != n) {
        final Z df = Functions.FACTORIAL.z(d);
        final Z[] qr = f.divideAndRemainder(df);
        if (!qr[1].isZero()) {
          return true;
        }
        f = qr[0];
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isPrimitive(++mN) && is(mN)) {
        mPrimitive.add(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
