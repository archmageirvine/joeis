package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014851 Numbers k that divide s(k), where s(1)=1, s(j)=4*s(j-1)+j.
 * @author Sean A. Irvine
 */
public class A014851 extends A014825 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
