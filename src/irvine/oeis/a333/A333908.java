package irvine.oeis.a333;

import irvine.math.z.Z;
import irvine.oeis.a030.A030604;

/**
 * A333908 Position of n-th 0 in A030604.
 * @author Sean A. Irvine
 */
public class A333908 extends A030604 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

