package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A031145 Factorials with a record number of zeros.
 * @author Sean A. Irvine
 */
public class A031145 extends A000142 {

  private int mZeroCount = -1;

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      final int z = A031144.zeroCount(f);
      if (z > mZeroCount) {
        mZeroCount = z;
        return f;
      }
    }
  }
}

