package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014854 Numbers n such that n divides s(n), where s(1)=1, s(k)=7*s(k-1)+k.
 * @author Sean A. Irvine
 */
public class A014854 extends A014830 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
