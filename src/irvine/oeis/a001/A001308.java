package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001308 Order of Chevalley group D_n (2).
 * @author Sean A. Irvine
 */
public class A001308 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z p = Z.ONE.shiftLeft(++mN).subtract(1);
    for (int k = 1; k < mN; ++k) {
      p = p.multiply(Z.ONE.shiftLeft(2 * k).subtract(1));
    }
    return p.shiftLeft(mN * (mN - 1));
  }
}
