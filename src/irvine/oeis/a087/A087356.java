package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A087356 Beginning with 2, smallest primes such that a(k)-a(k-1) is a distinct power of 2.
 * @author Sean A. Irvine
 */
public class A087356 extends Sequence0 {

  private Z mA = null;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    long k = -1;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = Z.ONE.shiftLeft(k).add(mA);
        if (t.isProbablePrime()) {
          mUsed.set(k);
          mA = t;
          return mA;
        }
      }
    }
  }
}
