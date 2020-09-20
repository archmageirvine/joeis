package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a020.A020847;

/**
 * A034978 a(n)^2 is smallest square starting with a string of n 1's.
 * @author Sean A. Irvine
 */
public class A034978 implements Sequence {

  // Terms either 3^(m)4 (e.g., 33333334) or concatenation of
  // digits in A020847, possibly + 1 (sqrt(90))

  private final Sequence mA020847 = new A020847();
  private Z mA = Z.ZERO;  // sqrt(90) expansion
  private Z mB = Z.ZERO;  // 333...
  private String mPrefix = "";
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    mPrefix = mPrefix + "1";
    if (mPrev.square().toString().startsWith(mPrefix)) {
      return mPrev;
    }
    while (true) {
      mA = mA.multiply(10).add(mA020847.next());
      mB = mB.multiply(10).add(3);
      if (mA.square().toString().startsWith(mPrefix)) {
        mPrev = mA;
        return mA;
      }
      final Z a1 = mA.add(1);
      if (a1.square().toString().startsWith(mPrefix)) {
        mPrev = a1;
        return a1;
      }
      final Z b1 = mB.add(1);
      if (b1.square().toString().startsWith(mPrefix)) {
        mPrev = b1;
        return b1;
      }
    }
  }
}
