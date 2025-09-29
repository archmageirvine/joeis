package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080751 a(n) is smallest number greater than a(n-1) such that the sequence contains a total of a(n) base 10 digits + commas through n terms (assuming one comma between each pair of terms).
 * @author Sean A. Irvine
 */
public class A080751 extends Sequence1 {

  private Z mA = null;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(1); // account for commas
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
