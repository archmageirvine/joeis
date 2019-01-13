package irvine.oeis.a002;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002870.
 * @author Sean A. Irvine
 */
public class A002870 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.ONE;
    ++mN;
    for (int k = 1; k <= mN; ++k) {
      m = m.max(Stirling.secondKind(mN, k));
    }
    return m;
  }
}
