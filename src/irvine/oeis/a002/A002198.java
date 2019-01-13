package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002198.
 * @author Sean A. Irvine
 */
public class A002198 extends A002197 {

  @Override
  public Z next() {
    return nextQ(++mN).den().shiftLeft(2 * mN + 2);
  }
}
