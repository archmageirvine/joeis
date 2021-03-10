package irvine.oeis.a043;

import irvine.math.z.Z;

/**
 * A043720.
 * @author Sean A. Irvine
 */
public class A043720 extends A043544 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

