package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002264 Nonnegative integers repeated 3 times.
 * @author Sean A. Irvine
 */
public class A002264 implements Sequence {

  private Z mN = Z.ZERO;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM == 3) {
      mN = mN.add(1);
      mM = 0;
    }
    return mN;
  }
}
