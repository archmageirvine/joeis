package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068705 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = mN; k > 0; --k) {
      sb.append(Z.valueOf(k).pow(mN + 1 - k));
    }
    return new Z(sb);
  }
}
