package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014872.
 * @author Sean A. Irvine
 */
public class A014872 extends A014905 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
