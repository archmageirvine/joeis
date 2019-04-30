package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001861 Expansion of e.g.f. <code>exp(2*(exp(x) - 1))</code>.
 * @author Sean A. Irvine
 */
public class A001861 implements Sequence {

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
