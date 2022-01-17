package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A177855 Divisors of 2^1092 - 1.
 * @author Sean A. Irvine
 */
public class A177855 implements Sequence {

  // This is actually finite but has 178120883699712 terms so you will get sick of waiting
  // for this approach before the finiteness becomes a problem.

  private static final Z N = Z.ONE.shiftLeft(1092).subtract(1);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (N.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

