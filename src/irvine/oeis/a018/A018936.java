package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018936.
 * @author Sean A. Irvine
 */
public class A018936 extends A018935 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

