package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;


/**
 * A002697 a(n) = n*4^(n-1).
 * @author Sean A. Irvine
 */
public class A002697 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).shiftLeft(2 * mN - 2);
  }
}
