package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a022.A022300;

/**
 * A025512 Index of n-th 2 in A022300.
 * @author Sean A. Irvine
 */
public class A025512 extends A022300 {

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
