package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014836 Sum modulo n of all the digits of n in every base from 2 to <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A014836 extends A014837 {

  @Override
  public Z next() {
    return Z.valueOf(nextSum() % mN);
  }
}
