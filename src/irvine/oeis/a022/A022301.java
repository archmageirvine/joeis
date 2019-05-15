package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022301 Index of <code>n-th 1</code> in <code>A022300</code>.
 * @author Sean A. Irvine
 */
public class A022301 extends A022300 {

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
