package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007356.
 * @author Sean A. Irvine
 */
public class A007356 implements Sequence {

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
