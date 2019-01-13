package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000065.
 * @author Sean A. Irvine
 */
public class A000065 extends A000041 {

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }
}

