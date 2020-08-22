package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033691 Minimal number of vertices in 1-1 deficient regular graph where minimal degree is 1 and maximal degree is n.
 * @author Sean A. Irvine
 */
public class A033691 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return Z.valueOf(mN).multiply(mN / 2 + 1);
    } else if ((mN & 3) == 3) {
      final long i = mN / 4;
      return Z.valueOf(mN + 1).multiply(2 * i + 2);
    } else {
      final long i = (mN - 5) / 4;
      return Z.valueOf(2 * i + 6).multiply(i).add(5).multiply(4);
    }
  }
}
