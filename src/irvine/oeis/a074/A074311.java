package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074311 a(1) = 1; a(2) = 2; a(n) = smallest number greater than the previous term such that the average of three successive terms is a prime.
 * @author Sean A. Irvine
 */
public class A074311 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z v = mA.add(mB);
    final long r = v.mod(3);
    Z t = mB;
    while (t.mod(3) != (3 - r) % 3) {
      t = t.subtract(1);
    }
    while (true) {
      t = t.add(3);
      if (mA.add(mB).add(t).divide(3).isProbablePrime()) {
        mA = mB;
        mB = t;
        return t;
      }
    }
  }
}
