package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A100359 Numbers n such that 2^n+n+1 is prime.
 * @author Sean A. Irvine
 */
public class A100359 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.shiftLeft(++mN).add(mN + 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

