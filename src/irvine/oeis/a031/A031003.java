package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a030.A030998;

/**
 * A031003 Position of n-th 4 in A030998.
 * @author Sean A. Irvine
 */
public class A031003 extends A030998 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

