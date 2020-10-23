package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036214.
 * @author Sean A. Irvine
 */
public class A036214 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN * mN + 3 * mN + 1).add(Z.ONE.shiftLeft(2 * mN * mN + 2 * mN)).subtract(Z.ONE.shiftLeft(3 * mN + 1)).subtract(1).shiftLeft(mN).divide(Z.ONE.shiftLeft(2 * mN + 1).subtract(1));
  }
}
