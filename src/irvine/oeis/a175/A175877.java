package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.oeis.a007.A007497;

/**
 * A175877.
 * @author Sean A. Irvine
 */
public class A175877 extends A007497 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}

