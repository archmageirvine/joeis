package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014836.
 * @author Sean A. Irvine
 */
public class A014836 extends A014837 {

  @Override
  public Z next() {
    return Z.valueOf(nextSum() % mN);
  }
}
