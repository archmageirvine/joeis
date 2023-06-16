package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031147 Smallest power of 2 containing exactly n zeros.
 * @author Sean A. Irvine
 */
public class A031147 extends A031146 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().longValueExact());
  }
}

