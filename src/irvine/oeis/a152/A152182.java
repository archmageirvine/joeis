package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001113;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A152182 The sequence is a lattice filling using the exponential "E" constant digits base ten.
 * @author Sean A. Irvine
 */
public class A152182 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    final long total = Z.TEN.pow(mN).longValueExact();
    final Sequence e = new A001113();
    long count = 0;
    long value = 0;
    final long mod = total / 10; // = 10^(n-1)
    // Initial fill
    for (int i = 0; i < mN; ++i) {
      value = value * 10 + e.next().intValue();
    }
    long position = 1;
    if (!seen.isSet(value)) {
      seen.set(value);
      ++count;
    }
    while (count < total) {
      final long digit = e.next().longValue();
      // Rolling update: drop leading digit, add new digit
      value = (value % mod) * 10 + digit;
      ++position;
      if (!seen.isSet(value)) {
        seen.set(value);
        ++count;
      }
    }
    return Z.valueOf(position);
  }
}
