package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014853 Numbers n such that n divides s(n), where s(1)=1, s(k)=6*s(k-1)+k.
 * @author Sean A. Irvine
 */
public class A014853 extends A014829 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
