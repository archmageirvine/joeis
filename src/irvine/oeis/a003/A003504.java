package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003504.
 * @author Sean A. Irvine
 */
public class A003504 implements Sequence {

  private Z mS = Z.TWO;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= 44) {
      throw new UnsupportedOperationException("Sequence is not integral");
    }
    if (mN < 2) {
      return Z.ONE;
    }
    final Z res = mS.divide(mN - 1);
    mS = mS.add(res.square());
    return res;
  }
}

