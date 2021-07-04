package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014857 Numbers k that divide s(k), where s(1)=1, s(j)=9*s(j-1)+j.
 * @author Sean A. Irvine
 */
public class A014857 extends A014832 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
