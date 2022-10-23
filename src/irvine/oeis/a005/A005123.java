package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005123 Numbers n such that 8n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A005123 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply(8).add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

