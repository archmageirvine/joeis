package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014873 Numbers k that divide s(k), where s(1)=1, s(j)=22*s(j-1)+j.
 * @author Sean A. Irvine
 */
public class A014873 extends A014907 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
