package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A100357 Numbers k such that 2^k + k^2 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A100357 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.shiftLeft(++mN).add(mN * (long) mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

