package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000655 a(n) = number of letters in a(n-1), a(1) = 1 (in English).
 * @author Sean A. Irvine
 */
public class A000655 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (mN <= 2) {
      if (mN == 0) {
        ++mN;
        return Z.ONE;
      } else if (mN == 1) {
        ++mN;
        return Z.THREE;
      } else {
        ++mN;
        return Z.FIVE;
      }
    } else {
      return Z.FOUR;
    }
  }
}
