package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033289 Odd power perfect numbers: numbers k such that opsigma(k) = 2*k, where opsigma(k) = A033634(k).
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

