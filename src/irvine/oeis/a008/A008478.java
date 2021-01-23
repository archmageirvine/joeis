package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008478 n = Product p_j^k_j = Product k_j^p_j; p_j in A000040.
 * @author Sean A. Irvine
 */
public class A008478 extends A008477 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
