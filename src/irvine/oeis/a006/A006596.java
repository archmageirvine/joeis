package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006596.
 * @author Sean A. Irvine
 */
public class A006596 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.shiftLeft(2 * mN + 1).subtract(Z.ONE.shiftLeft(mN + 1)).add(1).divide(5).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
