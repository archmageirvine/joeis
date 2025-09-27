package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080662.
 * @author Sean A. Irvine
 */
public class A080676 extends Sequence1 {

  private Z mA = null;
  private Z mSum = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      while (true) {
        mA = mA.add(1);
        final long len = Functions.DIGIT_LENGTH.l(mA);
        final Z s = mSum.add(len);
        if (s.equals(mA)) {
          mSum = s;
          return mA;
        }
      }
    }
  }
}
