package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014858 Numbers n such that n divides s(n), where s(1)=1, s(k)=11*s(k-1)+k.
 * @author Sean A. Irvine
 */
public class A014858 extends A014881 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
