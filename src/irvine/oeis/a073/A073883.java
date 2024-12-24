package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A073883 a(1)=1. For n &gt; 1, a(n) = the smallest positive integer not included earlier such that the n-th partial sum is n times a prime.
 * @author Sean A. Irvine
 */
public class A073883 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSum = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = mSum.add(k);
        final Z[] qr = t.divideAndRemainder(mN);
        if (qr[1].isZero() && qr[0].isProbablePrime()) {
          mUsed.set(k);
          mSum = t;
          return Z.valueOf(k);
        }
      }
    }
  }
}
