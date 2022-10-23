package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A343084 a(n) is the smallest number that is the sum of n positive squares in four ways.
 * @author Sean A. Irvine
 */
public class A343084 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.valueOf(1105);
    } else if (mN == 3) {
      return Z.valueOf(129);
    } else if (mN <= 5) {
      return Z.valueOf(mN + 48);
    } else if (mN <= 7) {
      return Z.valueOf(mN + 30);
    } else {
      return Z.valueOf(mN + 24);
    }
  }
}
