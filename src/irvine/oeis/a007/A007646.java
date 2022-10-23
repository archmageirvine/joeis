package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007646 Numbers k such that k*4^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A007646 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.shiftLeft(2 * mN).add(1).isProbablePrime()) {
        return n;
      }
    }
  }
}

