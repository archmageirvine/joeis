package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066271 Numbers n such that A066256(n) = n^2-2*n+2.
 * @author Sean A. Irvine
 */
public class A066271 extends A066256 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(mN * mN - 2 * mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
