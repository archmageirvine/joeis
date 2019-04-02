package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001912 Numbers n such that 4*n^2 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A001912 implements Sequence {

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
