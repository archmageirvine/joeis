package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007671.
 * @author Sean A. Irvine
 */
public class A007671 implements Sequence {

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
