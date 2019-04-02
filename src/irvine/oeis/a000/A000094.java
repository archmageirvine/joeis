package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000094 Number of trees of diameter 4.
 * @author Sean A. Irvine
 */
public class A000094 extends A000041 {

  @Override
  public Z next() {
    final Z z = super.next().add(-mN);
    return mN == 0 ? Z.ZERO : z;
  }
}

