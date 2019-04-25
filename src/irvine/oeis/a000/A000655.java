package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000655 <code>a(n) =</code> number of letters in <code>a(n-1) (in</code> English).
 * @author Sean A. Irvine
 */
public class A000655 implements Sequence {

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
