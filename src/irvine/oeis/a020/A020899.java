package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a007.A007895;

/**
 * A020899.
 * @author Sean A. Irvine
 */
public class A020899 extends A007895 {

  private long mN = -1;

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
