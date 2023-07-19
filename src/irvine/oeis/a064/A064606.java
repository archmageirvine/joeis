package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064606 Partial sum of Sigma_3(n) is divisible by n, where Sigma_3(n)=A001158(n).
 * @author Sean A. Irvine
 */
public class A064606 extends A064603 {

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
