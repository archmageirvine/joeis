package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033289 Odd Power Perfect numbers: opsigma(n) = 2*n.
 * @author Sean A. Irvine
 */
public class A033289 extends A033634 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.valueOf(mN).multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}

