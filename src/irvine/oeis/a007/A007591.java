package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007591 Numbers k such that k^2 + 4 is prime.
 * @author Sean A. Irvine
 */
public class A007591 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(4).isProbablePrime()) {
        return mN;
      }
    }
  }
}
