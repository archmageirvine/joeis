package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A001082 Generalized octagonal numbers: k*(3*k-2), k=0, +- 1, +- 2, +-3, ...
 * @author Sean A. Irvine
 */
public class A001082 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    return n.isEven()
      ? n.multiply(n.multiply(3).subtract(4)).shiftRight(2)
      : n.subtract(1).multiply(n.multiply(3).add(1)).shiftRight(2);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}

