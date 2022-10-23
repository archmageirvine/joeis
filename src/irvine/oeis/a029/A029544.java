package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029544 Near Cullen numbers: k such that (k+1)*2^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A029544 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN + 1).shiftLeft(mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
