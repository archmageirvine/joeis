package irvine.oeis.a029;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000003;

/**
 * A029724 Odd numbers congruent to 7 mod 8 such that (2^(h(-n)+2)-n) is a square, where h(-n) is the class number.
 * @author Sean A. Irvine
 */
public class A029724 extends A000003 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 8;
      final int h = (int) LongUtils.classNumber(-mN);
      final Z t = Z.ONE.shiftLeft(h + 2).subtract(mN);
      if (t.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
