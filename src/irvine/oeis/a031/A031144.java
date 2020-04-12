package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A031144 Numbers n such that <code>n!</code> has a record number of zeros.
 * @author Sean A. Irvine
 */
public class A031144 extends A000142 {

  private int mZeroCount = -1;

  static int zeroCount(Z n) {
    int cnt = 0;
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (Z.ZERO.equals(qr[1])) {
        ++cnt;
      }
      n = qr[0];
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      final int z = zeroCount(super.next());
      if (z > mZeroCount) {
        mZeroCount = z;
        return Z.valueOf(mN);
      }
    }
  }
}

