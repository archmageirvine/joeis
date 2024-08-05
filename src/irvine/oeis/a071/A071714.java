package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071710.
 * @author Sean A. Irvine
 */
public class A071714 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      Z right = Z.ONE;
      Z left = Z.ONE;
      long v = 1;
      while (m > 0) {
        v *= 10;
        left = left.multiply(m);
        right = right.multiply(mN % v);
        m /= 10;
      }
      final Z t = left.add(right);
      if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
