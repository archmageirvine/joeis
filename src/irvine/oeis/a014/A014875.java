package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014875 Numbers k that divide s(k), where s(1)=1, s(j)=24*s(j-1)+j.
 * @author Sean A. Irvine
 */
public class A014875 extends A014913 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
