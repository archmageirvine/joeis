package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014822 Numbers n such that n divides <code>s(n)</code>, where <code>s(1)=1, s(k)=10*s(k-1)+k</code> (A014824).
 * @author Sean A. Irvine
 */
public class A014822 extends A014824 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
