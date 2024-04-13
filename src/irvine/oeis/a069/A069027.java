package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069027 Powers of 2 with strictly increasing sum of digits.
 * @author Sean A. Irvine
 */
public class A069027 extends Sequence1 {

  private Z mA = null;
  private long mRecord = -1;

  @Override
  public Z next() {
    while (true) {
      mA = mA == null ? Z.ONE : mA.multiply2();
      final long ds = Functions.DIGIT_SUM.l(mA);
      if (ds > mRecord) {
        mRecord = ds;
        return mA;
      }
    }
  }
}

