package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000277.
 * @author Sean A. Irvine
 */
public class A000277 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).add(5).subtract(mN.shiftLeft(2).add(5).sqrt().multiply2());
  }
}
