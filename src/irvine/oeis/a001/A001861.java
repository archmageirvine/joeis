package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001861 Expansion of e.g.f. exp(2*(exp(x) - 1)).
 * @author Sean A. Irvine
 */
public class A001861 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Stirling.secondKind(mN, k).shiftLeft(k));
    }
    return s;
  }
}
