package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083769 a(1)=2; for n &gt;= 2, a(n) = smallest even number such that a(1)*a(2)*...*a(n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A083769 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    long k = 2;
    while (true) {
      k += 2;
      if (!mUsed.isSet(k)) {
        final Z u = mA.multiply(k);
        if (u.add(1).isProbablePrime()) {
          mUsed.set(k);
          mA = u;
          return Z.valueOf(k);
        }
      }
    }
  }
}
