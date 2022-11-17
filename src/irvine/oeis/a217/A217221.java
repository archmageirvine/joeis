package irvine.oeis.a217;

import irvine.math.z.Z;
import irvine.oeis.a033.A033762;

/**
 * A217221 Theta series of Kagome net with respect to a deep hole.
 * @author Georg Fischer
 */
public class A217221 extends A033762 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? Z.ZERO : super.next().multiply(6);
  }
}
