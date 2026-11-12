package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A087357 Index of powers of 2 arising as the difference of a pair of successive terms of A087356.
 * @author Sean A. Irvine
 */
public class A087357 extends Sequence0 {

  private Z mA = Z.TWO;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();

  @Override
  public Z next() {
    long k = -1;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = Z.ONE.shiftLeft(k).add(mA);
        if (t.isProbablePrime()) {
          mUsed.set(k);
          mA = t;
          return Z.valueOf(k);
        }
      }
    }
  }
}
