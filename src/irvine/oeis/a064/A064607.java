package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064607 Partial sum of Sigma_4(n) is divisible by n, where Sigma_4(n)=A001159(n).
 * @author Sean A. Irvine
 */
public class A064607 extends A064604 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
