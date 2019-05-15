package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022304 Index of <code>n-th 1</code> in <code>A022303</code>.
 * @author Sean A. Irvine
 */
public class A022304 extends A022303 {

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
