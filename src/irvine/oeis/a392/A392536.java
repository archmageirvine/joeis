package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A392536 allocated for Enrique Navarrete.
 * @author Sean A. Irvine
 */
public class A392536 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mA = 0;
  private long mB = 0;

  @Override
  public Z next() {
    if (mB == 0) {
      if (mA == 0) {
        mA = 2;
        mUsed.set(2);
        return Z.TWO;
      }
      mB = 6;
      mUsed.set(6);
      return Z.SIX;
    }
    long k = 2;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final long d = Functions.GCD.l(k, mA);
        if (d > 1 && Functions.MAKE_ODD.l(Functions.GCD.l(k / Functions.LPF.l(d), mB)) > 1) {
          mUsed.set(k);
          mA = mB;
          mB = k;
          return Z.valueOf(k);
        }
      }
    }
  }
}
