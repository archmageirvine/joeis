package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083567 Let B(k) be the number of binary digits in k equal to 1. This is the sequence of positive integers k such that 2B(k)=B(k^2).
 * @author Sean A. Irvine
 */
public class A083567 extends Sequence1 {

  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      if (2 * Long.bitCount(++mN) == Z.valueOf(mN).square().bitCount()) {
        return Z.valueOf(mN);
      }
    }
  }
}
