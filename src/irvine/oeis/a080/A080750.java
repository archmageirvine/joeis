package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080750 a(n) = largest number greater than a(n-1) such that the first n terms of the sequence contain a total of a(n) base-10 digits.
 * @author Sean A. Irvine
 */
public class A080750 extends Sequence1 {

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
        if (s.compareTo(mA) < 0) {
          mA = mA.subtract(1);
          mSum = mSum.add(Functions.DIGIT_LENGTH.l(mA));
          return mA;
        }
      }
    }
  }
}
