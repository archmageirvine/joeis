package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002698.
 * @author Sean A. Irvine
 */
public class A002698 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(2 * mN - 3).shiftLeft(2 * mN - 5);
  }
}
