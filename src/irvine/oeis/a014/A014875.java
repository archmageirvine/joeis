package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014875 Numbers n such that n divides <code>s(n)</code>, where <code>s(1)=1, s(k)=24*s(k-1)+k</code>.
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
