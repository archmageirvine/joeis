package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005019 <code>(0,1)-matrices</code> by <code>1-width</code>.
 * @author Sean A. Irvine
 */
public class A005019 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN * mN).subtract(Z.ONE.shiftLeft(mN).subtract(1).pow(mN));
  }

}

