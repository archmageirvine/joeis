package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035094.
 * @author Sean A. Irvine
 */
public class A035094 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      final Z t = k.multiply(mF).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
