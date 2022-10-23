package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034936 Numbers k such that 3*k + 4 is prime.
 * @author Sean A. Irvine
 */
public class A034936 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.multiply(3).add(4).isProbablePrime()) {
        return mN;
      }
    }
  }
}
