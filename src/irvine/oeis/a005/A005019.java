package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005019 The number of n X n (0,1)-matrices with a 1-width of 1.
 * @author Sean A. Irvine
 */
public class A005019 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft((long) mN * mN).subtract(Z.ONE.shiftLeft(mN).subtract(1).pow(mN));
  }

}

