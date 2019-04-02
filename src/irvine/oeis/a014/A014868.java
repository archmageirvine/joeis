package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014868 Numbers n such that n divides s(n), where s(1)=1, s(k)=18*s(k-1)+k.
 * @author Sean A. Irvine
 */
public class A014868 extends A014901 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
