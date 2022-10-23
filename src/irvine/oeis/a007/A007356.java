package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007356 Apocalyptic powers: 2^n contains 666.
 * @author Sean A. Irvine
 */
public class A007356 extends Sequence1 {

  private int mN = 156;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.shiftLeft(++mN).toString().contains("666")) {
        return Z.valueOf(mN);
      }
    }
  }
}
