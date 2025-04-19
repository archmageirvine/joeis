package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076863 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    return n.pow(mN - 2).add(n.multiply(Z.valueOf(mN - 1).pow(mN - 2)).divide2());
  }
}
