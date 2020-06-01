package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030494 If n is even, <code>2(n/2 + 1)! - 1;</code> if n is odd, <code>((n + 1)/2 + 1)! - 1</code>.
 * @author Sean A. Irvine
 */
public class A030494 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return mF.multiply2().subtract(1);
    } else {
      mF = mF.multiply((mN + 1) / 2 + 1);
      return mF.subtract(1);
    }
  }
}

