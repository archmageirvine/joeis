package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A394084 a(1) = 1, a(2) = 2; for n &gt; 2, a(n) is the smallest unused positive integer k whose greatest prime factor matches the greatest prime factor of the sum of the greatest prime factors of the previous terms.
 * @author Sean A. Irvine
 */
public class A394084 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mSum = 3;

  @Override
  public Z next() {
    if (!mUsed.isSet(1)) {
      mUsed.set(1);
      return Z.ONE;
    }
    if (!mUsed.isSet(2)) {
      mUsed.set(2);
      return Z.TWO;
    }
    final long gpf = Functions.GPF.l(mSum);
    long k = 0;
    while (true) {
      k += gpf;
      if (!mUsed.isSet(k) && Functions.GPF.l(k) == gpf) {
        mUsed.set(k);
        mSum += gpf;
        return Z.valueOf(k);
      }
    }
  }
}
