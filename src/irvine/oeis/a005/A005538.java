package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005538 Numbers n such that <code>8*3^n + 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A005538 implements Sequence {

  private Z mA = Z.EIGHT;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3);
      if (mA.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
