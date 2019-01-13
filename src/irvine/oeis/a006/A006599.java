package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006599.
 * @author Sean A. Irvine
 */
public class A006599 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.shiftLeft(2 * mN + 1).add(Z.ONE.shiftLeft(mN + 1)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
