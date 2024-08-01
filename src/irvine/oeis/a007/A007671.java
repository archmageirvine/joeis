package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007671 Numbers n such that 2^n + 2^((n + 1)/2) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A007671 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Z.ONE.shiftLeft(mN).add(Z.ONE.shiftLeft((mN + 1) / 2)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
