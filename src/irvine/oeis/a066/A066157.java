package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A066157 Numbers whose reciprocals have patterns of b repeating digits in their expansion in base b; leading non-repetitive digits are ignored.
 * @author Sean A. Irvine
 */
public class A066157 extends Sequence1 {

  private final LongDynamicArray<long[]> mFactors = new LongDynamicArray<>();
  private long mN = 2;

  private long[] getFactors(final long base) {
    if (mFactors.get(base) == null) {
      mFactors.set(base, ZUtils.toLong(Jaguar.factor(base).toZArray()));
    }
    return mFactors.get(base);
  }

  private boolean is(final long n, final long base) {
    long t = n;
    for (final long p : getFactors(base)) {
      while (t % p == 0) {
        t /= p;
      }
    }
    final Z m = Z.valueOf(t);
    return new IntegersMod(m).ord(Z.valueOf(base).mod(m)).longValueExact() == base;
  }

  private boolean is(final long n) {
    for (long b = 2; b < n; ++b) {
      if (is(n, b)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
