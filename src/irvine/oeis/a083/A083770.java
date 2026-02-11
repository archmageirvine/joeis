package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083770 Primes arising in A083769.
 * @author Sean A. Irvine
 */
public class A083770 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.THREE;
    }
    long k = 2;
    while (true) {
      k += 2;
      if (!mUsed.isSet(k)) {
        final Z u = mA.multiply(k);
        final Z v = u.add(1);
        if (v.isProbablePrime()) {
          mUsed.set(k);
          mA = u;
          return v;
        }
      }
    }
  }
}
