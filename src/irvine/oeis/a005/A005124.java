package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005124 Numbers n such that 8n + 3 is prime.
 * @author Sean A. Irvine
 */
public class A005124 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply(8).add(3).isProbablePrime()) {
        return mN;
      }
    }
  }
}

