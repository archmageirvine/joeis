package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002196.
 * @author Sean A. Irvine
 */
public class A002196 extends A002195 {

  @Override
  public Z next() {
    return nextQ().den().shiftLeft(mN == 0 ? 0 : 2 * mN - 1);
  }
}
