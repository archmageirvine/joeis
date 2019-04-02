package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005122 Numbers n such that 8n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A005122 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply(8).subtract(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

