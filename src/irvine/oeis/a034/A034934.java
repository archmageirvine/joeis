package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034934 Numbers k such that (3*k + 1)/2 is prime.
 * @author Sean A. Irvine
 */
public class A034934 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.multiply(3).add(1).divide2().isProbablePrime()) {
        return mN;
      }
    }
  }
}
