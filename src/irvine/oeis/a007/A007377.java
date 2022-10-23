package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007377 Numbers k such that the decimal expansion of 2^k contains no 0.
 * @author Sean A. Irvine
 */
public class A007377 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (!Z.ONE.shiftLeft(++mN).toString().contains("0")) {
        return Z.valueOf(mN);
      }
    }
  }
}
