package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065197 Solutions to A065191(n) = n.
 * @author Sean A. Irvine
 */
public class A065197 extends A065191 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().longValueExact() == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
