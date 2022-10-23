package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001912 Numbers k such that 4*k^2 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A001912 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().shiftLeft(2).add(1).isPrime()) {
        return mN;
      }
    }
  }
}
