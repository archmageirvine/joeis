package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000117.
 * @author Sean A. Irvine
 */
public class A000117 extends A000011 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}

