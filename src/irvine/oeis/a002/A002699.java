package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002699.
 * @author Sean A. Irvine
 */
public class A002699 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).shiftLeft(2 * mN - 1);
  }
}
