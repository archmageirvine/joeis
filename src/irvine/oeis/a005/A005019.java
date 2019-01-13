package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005019.
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

