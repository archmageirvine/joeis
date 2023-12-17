package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067433 extends Sequence1 {

  private long mN = 1;
  private long mM = 3;

  private long step(final long n) {
    return n % 3 == 0 ? n / 3 : 3 * ((n + 2) / 3);
  }

  @Override
  public Z next() {
    if (mM == 1) {
      mM = step(++mN);
    } else {
      mM = step(mM);
    }
    return Z.valueOf(mM);
  }
}
