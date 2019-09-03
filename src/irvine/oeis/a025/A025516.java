package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a022.A022303;

/**
 * A025516 Index of <code>n-th 2</code> in <code>A022303</code>.
 * @author Sean A. Irvine
 */
public class A025516 extends A022303 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
