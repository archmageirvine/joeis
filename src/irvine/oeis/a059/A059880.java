package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059880 Positions of negative terms in A059876.
 * @author Sean A. Irvine
 */
public class A059880 extends A059876 {

  @Override
  public Z next() {
    while (super.next().signum() >= 0) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
