package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000301.
 * @author Sean A. Irvine
 */
public class A000301 extends A000045 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue());
  }

}

